package com.hibernatepractise.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateprcatise.util.HibernateUtil;

public class PatientDoctorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();

		Patient p = new Patient();

		p.setPatientName("Surya");

		Patient p1 = new Patient();

		p1.setPatientName("Suryakiran");

		Patient p2 = new Patient();

		p2.setPatientName("kiran");

		s.save(p);

		s.save(p1);

		s.save(p2);

		Doctor doctor = new Doctor();

		doctor.setDoctorName("Hari");

		doctor.getPatients().add(p);

		doctor.getPatients().add(p1);

		doctor.getPatients().add(p2);

		Doctor doctor1 = new Doctor();

		doctor1.setDoctorName("Ganesh");

		doctor1.getPatients().add(p);

		doctor1.getPatients().add(p1);

		doctor1.getPatients().add(p2);

		s.save(doctor);

		s.save(doctor1);

		tran.commit();

		s.close();

		sf.close();
	}

}
