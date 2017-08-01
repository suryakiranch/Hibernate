package com.hibernatepratise.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateprcatise.util.HibernateUtil;

public class EmployeeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tran = s.beginTransaction();

		Employee employee = new Employee();

		employee.setEname("Surya");
		employee.setEmail("s@g.com");

		FullTime fullTime = new FullTime();

		fullTime.setSalary(10000);

		fullTime.setEname("Kiran");

		fullTime.setEmail("k@k.com");

		PartTime partTime = new PartTime();

		partTime.setEname("Kranti");
		partTime.setEmail("k@kk.com");
		partTime.setRate("1000.0");
		
		s.persist(employee);
		
		s.persist(fullTime);
		
		s.persist(partTime);

		tran.commit();

		s.close();

		sf.close();
	}

}
