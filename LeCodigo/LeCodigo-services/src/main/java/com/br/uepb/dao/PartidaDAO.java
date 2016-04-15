package com.br.uepb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import com.br.uepb.domain.Partida;

import conexaoBD.HibernateUtil;

public class PartidaDAO {
	
	private static Session session;
	
	//singleton para o partidaDAO
	private static PartidaDAO partidaDAO;
	
	public static PartidaDAO getInstance(){
		if(partidaDAO == null){
			partidaDAO = new PartidaDAO();
			session = HibernateUtil.getSessionFactory().openSession();
			return partidaDAO;
		}else{
			return partidaDAO;
		}
	}
	
	private PartidaDAO() { }
	
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
