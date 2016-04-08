package com.br.uepb.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
		
		session.close();
		return questao1;
	}

	public Questao buscarQuestao(int id_questao) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Questao questao = (Questao) session.get(Questao.class, Integer.valueOf(id_questao));
			session.close();
			return questao;
		} catch (HibernateError err) {
			System.err.println("Erro ao buscar a questão. " + err);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Questao> listarQuestoes(int fase) {
		List<Questao> lista = new ArrayList<>();
		try {
			String SQL = "SELECT * FROM questao WHERE fase = " + fase + ";";
			Session sessao = HibernateUtil.getSessionFactory().openSession();
			lista.containsAll((Collection<Questao>) sessao.createSQLQuery(SQL));
			sessao.flush();
			sessao.close();
			return lista;
		} catch (HibernateException e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Questao> listarQuestoes(int fase, TipoQuestao_Enum tipo_questao) {
		List<Questao> lista = new ArrayList<>();
		try {
			String SQL = "SELECT * FROM questao WHERE fase = " + fase + " AND tipo_questao = + " + tipo_questao;
			Session sessao = HibernateUtil.getSessionFactory().openSession();
			lista.containsAll((Collection<Questao>) sessao.createSQLQuery(SQL));
			sessao.flush();
			sessao.close();
			return lista;
		} catch (HibernateException e) {
			return null;
		}
	}

}
