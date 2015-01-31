package com.chankan.application.thinktank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtil {
	
	
	SessionFactory sessionFactory = null;
	public Session getSession ()
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		return session;
	}

}