package com.br.uepb.dao;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import com.br.uepb.domain.Questao;
import com.br.uepb.utilities.HibernateUtil;
 
public class QuestaoDAO {

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

	public Questao buscarQuestao(int fase, int etapa) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Questao questao = (Questao) session
					.createSQLQuery("SELECT * FROM QUESTAO WHERE FASE = " + fase + " AND ETAPA = " + etapa);
			session.close();
			return questao;
		} catch (HibernateError err) {
			System.err.println("Erro ao buscar a questão. " + err);
			return null;
		}
	}

	public Questao PulaQuestao(int fase, int etapa) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Questao questao = (Questao) session.createSQLQuery("UPDATE QUESTAO"
					+ "SET resposta_doAluno = polou"
					+ "WHERE id_questao = "+ fase);
			session.close();
			return questao;
		} catch (HibernateError err) {
			System.err.println("Erro ao buscar a questão. " + err);
			return null;
		}
	}
}
