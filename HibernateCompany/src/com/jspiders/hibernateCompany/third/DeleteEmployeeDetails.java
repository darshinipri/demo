package com.jspiders.hibernateCompany.third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernateComapny.first.Employee;
import com.jspiders.hibernateCompany.second.HibernateUtil;

public class DeleteEmployeeDetails {

	public static void main(String[] args) {
		Session   session  =null;
		   SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		   session=sessionFactory.openSession();
		   
		   
		   Transaction tx = session.getTransaction();
		   tx.begin();
		   
		   Employee e = session.find(Employee.class, 4);
		   Employee e1 = session.find(Employee.class, 5);
		   Employee e2 = session.find(Employee.class, 6);
		   
		   
		   session.delete(e);
		   session.delete(e1);
		   session.delete(e2);
		   
           tx.commit();
		   
		   if(session!=null)
		   {
			   session.close();
		   }

	}

}
