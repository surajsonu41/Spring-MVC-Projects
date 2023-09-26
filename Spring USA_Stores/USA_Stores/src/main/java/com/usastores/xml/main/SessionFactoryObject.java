package com.usastores.xml.main;

import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration;

public class SessionFactoryObject {
	private static SessionFactoryObject sessionFactoryObject = new SessionFactoryObject();
	private SessionFactory sessionFactory;
	
	private SessionFactoryObject() {
		Configuration config = new Configuration();
		config.configure();
		sessionFactory = config.buildSessionFactory();
		
	}
	
	public static SessionFactory getInstance() {
		return sessionFactoryObject.sessionFactory;
	}
}
