package com.hibernatepractise.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernatepractise.model.Address;
import com.hibernatepractise.model.Employee;
import com.hibernateprcatise.util.HibernateUtil;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();

		Transaction tran = s.beginTransaction();

		// Employee emp = new Employee();
		// emp.setEname("SuryaKiran");
		// s.save(emp);

		// Employee employee = s.load(Employee.class, 1L);

		// System.out.println(employee.getEname());

		// employee.setEname("Surya");

		// s.update(employee);

		Address address = new Address("Chicago", "IL");

		Address address1 = new Address("Dallas", "Tx");

		Address address2 = new Address("Austin", "Tx");

		Employee employee = new Employee("Surya", address);

		Employee employee1 = new Employee("Surya1", address1);

		Employee employee2 = new Employee("Surya2", address2);

		s.save(employee);

		s.save(employee1);

		s.save(employee2);

		tran.commit();

		s.close();
		sf.close();

	}

}
