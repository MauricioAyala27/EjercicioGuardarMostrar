package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Persona;
import app.HibernateUtil;

public class DaoPersona {
	
	public void guardarPersona(Persona pe) {
		
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			
			transaction = session.beginTransaction();
			session.save(pe);
			transaction.commit();
			
			
		}catch(Exception e) {
			
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}
	
	public List<Persona> listarPersona(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("from Persona",Persona.class).list();
		}
	}

}
