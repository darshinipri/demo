package com.jspiders.hibernateCompany.third;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernateComapny.first.Employee;
import com.jspiders.hibernateCompany.second.HibernateUtil;

public class RetriveEmployeeDetails {

	public static void main(String[] args)
	{
		   Session   session  =null;
		   SessionFactory  sessionFactory = HibernateUtil.getSessionFactory();
		   session=sessionFactory.openSession();
		   
		   
		   Transaction tx = session.getTransaction();
		   tx.begin();
		   
		   Employee e =  session.find(Employee.class, 2);
		   int empno=e.getEmpno();
		   String ename=e.getEname();
		   double salary=e.getSalary();
		   
		   System.out.println("empno:"+empno);
		   System.out.println("ename:"+ename);
		   System.out.println("salary:"+salary);
		   
		   tx.commit();
		   
		   if(session!=null)
		   {
			   session.close();
		   }
		   

	}

}
