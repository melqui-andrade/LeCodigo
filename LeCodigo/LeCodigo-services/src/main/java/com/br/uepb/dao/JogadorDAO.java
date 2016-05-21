package com.br.uepb.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import com.br.uepb.domain.Jogador;
import com.br.uepb.domain.Partida;

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

}
