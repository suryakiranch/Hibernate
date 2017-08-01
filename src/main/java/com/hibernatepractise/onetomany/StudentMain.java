package com.hibernatepractise.onetomany;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateprcatise.util.HibernateUtil;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tran = s.beginTransaction();

		Student student = new Student();

		student.setStudentName("Surya");

		Certificate certificate = new Certificate();

		certificate.setCertificateName("OCA");

		certificate.setIssuedDate(LocalDate.of(2016, Month.JANUARY, 10));

		certificate.setStudent(student);

		Certificate certificate1 = new Certificate();

		certificate1.setCertificateName("OCP");

		certificate1.setIssuedDate(LocalDate.of(2016, Month.JANUARY, 11));

		certificate1.setStudent(student);

		student.getCertificates().add(certificate);

		student.getCertificates().add(certificate1);

		s.save(student);
		tran.commit();
		s.close();
		sf.close();

	}

}
