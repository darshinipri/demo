package com.jspiders.hibernateCompany.second;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
    private static SessionFactory  sessionFactory= buildSessionFactory();
    
    private static  SessionFactory buildSessionFactory()
    {
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory  sessionFactory=config.buildSessionFactory();
    	return sessionFactory;
    	
    }
    public static SessionFactory getSessionFactory()
    {
    	return sessionFactory;
    }

}
