package com.hibernatepractise.hql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernatepractise.onetomany.Certificate;
import com.hibernatepractise.onetomany.Student;
import com.hibernateprcatise.util.HibernateUtil;

public class HqlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// displayStudentRecords();
		// displayCertificatewithWhere();

		displayCertificatewithJoin();

	}

	public static void displayStudentRecords() {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		javax.persistence.Query query = session.createQuery("from Student");

		List<Student> li = query.getResultList();

		System.out.println(li.size());

		session.close();

		sf.close();

	}

	public static void displayCertificatewithWhere() {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		javax.persistence.Query query = session.createQuery("from Certificate where certificateId=:certificateId");

		query.setParameter("certificateId", 1L);

		Certificate li = (Certificate) query.getSingleResult();
		System.out.println(li.getCertificateName());

		session.close();

		sf.close();

	}

	public static void displayCertificatewithJoin() {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		javax.persistence.Query query = session
				.createQuery("from Student s join s.certificates c where c.certificateId=1");

		List<Student> li = query.getResultList();

		System.out.println(li.size());
		session.close();

		sf.close();

	}
	public static void displayStudentwithJoin() {

		SessionFactory sf = HibernateUtil.getSessionFactory();

		Session session = sf.openSession();

		javax.persistence.Query query = session
				.createQuery("from certificate c join c.student s where s.studentId=1");

		List<Certificate> li = query.getResultList();

		System.out.println(li.size());
		session.close();

		sf.close();

	}
}
