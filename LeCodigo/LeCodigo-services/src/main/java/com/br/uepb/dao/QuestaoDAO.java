package com.br.uepb.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.br.uepb.domain.Bloco;
import com.br.uepb.domain.Questao;
import com.br.uepb.domain.TipoQuestao_Enum;

import conexaoBD.HibernateUtil;


public class QuestaoDAO {
	
private Session session;
	
	public QuestaoDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	public Questao adicionarQuestao(Questao questao) {

		if (!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Questao questao1 = null;
		try {
			session.save(questao);
			session.flush();
			tx.commit();
		} catch (Exception e) {
			
		}
		session.flush();
		session.close();
		return questao1;
	}

	public Questao buscarQuestao(int id_questao) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Questao questao = (Questao) session.get(Questao.class, Integer.valueOf(id_questao));
			session.flush();
			session.close();
			return questao;
		} catch (HibernateError err) {
			System.err.println("Erro ao buscar a questão. " + err);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Questao> listarQuestoes(int fase) {
		List<Questao> lista = new ArrayList<Questao>();
		try {
			
			String SQL = "SELECT * FROM questao WHERE fase = " + fase + ";";
			
			if(!session.isOpen()) session = HibernateUtil.getSessionFactory().openSession();	
					
			Transaction tx = session.beginTransaction();
			boolean verifica = true;
			try {
				lista = session.createSQLQuery(SQL).list();
			} catch (Exception e) {
				verifica = false;
			}						
			session.flush();
			tx.commit();
			session.close();
			return lista;
		} catch (HibernateException e) {
			System.err.println("Erro ao listar as questões. " + e); 
			return null;
		}		
	}

	@SuppressWarnings("unchecked")
	public List<Questao> listarQuestoes(int fase, TipoQuestao_Enum tipo_questao) {
		List<Questao> lista = new ArrayList<>();
		try {
			String SQL = "SELECT * FROM questao WHERE fase = " + fase + " AND tipo_questao = + " + tipo_questao.getTipos();
			session = HibernateUtil.getSessionFactory().openSession();
			lista = session.createSQLQuery(SQL).list();
			session.flush();
			session.close();
			return lista;
		} catch (HibernateException e) {
			System.err.println("Erro ao listar as questões. " + e); 
			return null;
		}
	}

}
