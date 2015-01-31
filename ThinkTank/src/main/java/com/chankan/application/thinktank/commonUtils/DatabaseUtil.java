package com.chankan.application.thinktank.commonUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtil {

	private SessionFactory sessionFactory = null;
	
	public Session getNewSession()
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	
	}
}
