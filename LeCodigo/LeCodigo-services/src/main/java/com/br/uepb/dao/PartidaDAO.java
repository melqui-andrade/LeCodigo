package com.br.uepb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import com.br.uepb.domain.Partida;

import conexaoBD.HibernateUtil;

public class PartidaDAO {
	
private Session session;
	
	public PartidaDAO() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean salvarPartida(Partida partida){
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.save(partida);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();
		
		return verifica;
	}
	
	public boolean atualizarPartida(Partida partida){
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		boolean verifica = true;
		try {
			session.update(partida);
		} catch (Exception e) {
			verifica = false;
		}
		session.flush();
		tx.commit();
		session.close();
		
		return verifica;
	}
	
	public Partida buscarPartida(int id){
		
		if(!session.isOpen())
			session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Partida partida = null;
		try {
			partida = (Partida) session.createCriteria(Partida.class).add(Restrictions.eq("id", id)).uniqueResult();
			session.flush();
			tx.commit();
		} catch (Exception e) {
		}
		
		session.close();
		
		return partida;
	}
}
