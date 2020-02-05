package com.jspiders.hibernateCompany.third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernateComapny.first.Employee;
import com.jspiders.hibernateCompany.second.HibernateUtil;

public class UpdateEmployeeDetails {

	public static void main(String[] args)
	{
		Session   session  =null;
		   SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		   session=sessionFactory.openSession();
		   
		   
		   Transaction tx = session.getTransaction();
		   tx.begin();
		   
		   Employee e = session.find(Employee.class, 2);
		   System.out.println("empno:"+e.getEmpno());
		   System.out.println("ename:"+e.getEname());
		   System.out.println("salary:"+e.getSalary());
		   
		   e.setSalary(4000.0);
		   
		   
		   System.out.println("empno:"+e.getEmpno());
		   System.out.println("ename:"+e.getEname());
		   System.out.println("salary:"+e.getSalary());
		   
		   tx.commit();
		   
		   if(session!=null)
		   {
			   session.close();
		   }
		   


		   	

	}

}
