package com.hibernatepractise.Criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.hibernateprcatise.util.HibernateUtil;

public class CriteriaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEmp("2");

	}

	public static void getEmp(String eid) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		System.out.println("kjsnjcsnjsj");

		Transaction tran = s.beginTransaction();

		Criteria criteria = s.createCriteria(Employee.class);

		criteria.add(Restrictions.gt("eid", 2));

		List li = criteria.list();

		for (Iterator iterator = li.iterator(); iterator.hasNext();) {

			Employee emp = (Employee) iterator.next();
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
		}

		tran.commit();
		s.close();
		sf.close();

	}
}
