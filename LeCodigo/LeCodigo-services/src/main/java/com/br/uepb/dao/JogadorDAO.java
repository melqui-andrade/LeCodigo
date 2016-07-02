package com.br.uepb.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.br.uepb.domain.Estatistica;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;
import com.br.uepb.domain.Relatorio;

import java.util.*;

import conexaoBD.HibernateUtil;

public class JogadorDAO {
	
	private static Session session;
	
	//singleton para o jogadorDAO
	private static JogadorDAO jogadorDAO;
	
	public static JogadorDAO getInstance(){
		if(jogadorDAO == null){
			jogadorDAO = new JogadorDAO();
			session = HibernateUtil.getSessionFactory().openSession();
			return jogadorDAO;
		}else{
			return jogadorDAO;
		}
	}
	
	private JogadorDAO() { }
	
	public boolean adicionarJogador(Jogador jogador){
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.save(jogador);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();
		
		return verifica;
	}
	
	/*public boolean atualizarJogo(Jogador jogador){
		return false;
	}*/
	
	public Jogador buscarJogador(int id){
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Jogador jogador = null;
		try {
			Query query = session.createQuery("FROM Jogador WHERE id= :id"); 
			query.setParameter("id", id);
			jogador = (Jogador)query.uniqueResult();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		session.close();
		
		return jogador;
	}

	public Jogador buscarJogador(String login) {
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		
		Jogador jogador = null;
		try {
			Query query = session.createQuery("FROM Jogador WHERE login= :login"); 
			query.setParameter("login", login);
			jogador = (Jogador)query.uniqueResult();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		session.close();
		return jogador;
	}

	public boolean autenticarJogador(String login, String senha) {
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			boolean verifica = true;
		try {
			session.createQuery("from Jogador where login='"+login+"' and senha='"+senha+"'").list();
		} catch (RuntimeException e) {
			verifica = false;
		}finally{
			session.flush();
			tx.commit();
			session.close();
		}
		
		return verifica;
	}

	public int buscarPontuacao(int idJogador) {
		Jogador jogador = buscarJogador(idJogador);
		int pontuacao = jogador.getPontuacao_total();
		return pontuacao;
	}
	
	public List<Jogador> rankingJogadores(){
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			boolean verifica = true;
		try {
			List listaJogadores = session.createQuery("from Jogador order by pontuacao_total").list();
			return listaJogadores;
		} catch (RuntimeException e) {
			verifica = false;
		}finally{
			session.flush();
			tx.commit();
			session.close();
		}
		
		return null;
	}
	
	public boolean atualizarJogador(Jogador jogador){
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.update(jogador);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();
		
		return verifica;
	}
	
	public Relatorio estatisticaDaTurma(){
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			boolean verifica = true;
		try {
			List<Relatorio> listaJogadores = session.createQuery("from Relatorio").list();
			Relatorio relatorioDaTurma = new Relatorio();
			for (Relatorio relatorio : listaJogadores) {
				relatorioDaTurma.set_tipos_atribuicao_de_variaveis(
						soma(relatorioDaTurma.get_tipos_atribuicao_de_variaveis(), 
								relatorio.get_tipos_atribuicao_de_variaveis()));
				relatorioDaTurma.set_if_else(
						soma(relatorioDaTurma.get_if_else(), 
								relatorio.get_if_else()));
				relatorioDaTurma.set_switch_case(
						soma(relatorioDaTurma.get_switch_case(), 
								relatorio.get_switch_case()));
				relatorioDaTurma.set_for(
						soma(relatorioDaTurma.get_for(), 
								relatorio.get_for()));
				relatorioDaTurma.set_while(
						soma(relatorioDaTurma.get_while(), 
								relatorio.get_while()));
				relatorioDaTurma.set_do_while(
						soma(relatorioDaTurma.get_do_while(), 
								relatorio.get_do_while()));
				relatorioDaTurma.set_contadores(
						soma(relatorioDaTurma.get_contadores(), 
								relatorio.get_contadores()));
				relatorioDaTurma.set_ordenacao(
						soma(relatorioDaTurma.get_ordenacao(), 
								relatorio.get_ordenacao()));
				relatorioDaTurma.set_funcoes(
						soma(relatorioDaTurma.get_funcoes(), 
								relatorio.get_funcoes()));
				relatorioDaTurma.set_geral(
						soma(relatorioDaTurma.get_geral(), 
								relatorio.get_geral()));
			}
			return relatorioDaTurma;
		} catch (RuntimeException e) {
			verifica = false;
		}finally{
			session.flush();
			tx.commit();
			session.close();
		}
		
		return null;
	}

	private Estatistica soma(Estatistica estGeral,
			Estatistica estIndividual) {
		Estatistica estatistica = new Estatistica();
		estatistica.setQtdRespostaCerta(estGeral.getQtdRespostaCerta()+estIndividual.getQtdRespostaCerta());
		estatistica.setQtdRespostaErrada(estGeral.getQtdRespostaErrada()+estIndividual.getQtdRespostaErrada());
		estatistica.setQtdRespostaPulada(estGeral.getQtdRespostaPulada()+estIndividual.getQtdRespostaPulada());
		return estatistica;
	}

}
