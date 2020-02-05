package com.jspiders.hibernateCompany.third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernateComapny.first.Employee;
import com.jspiders.hibernateCompany.second.HibernateUtil;

public class UserInterface {

	public static void main(String[] args) {
		 SessionFactory  sessionFactory= HibernateUtil.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 
		 Transaction tx=session.getTransaction();
		 tx.begin();
		 
		 Employee e1=new Employee();
		 e1.setEname("smith");
		 e1.setSalary(2000.0);
		 
		 Employee e2=new Employee();
		 e2.setEname("allen");
		 e2.setSalary(3000.0);
		 
		 session.save(e1);
		 session.save(e2);
		 
		 tx.commit();
		 
	}

}
