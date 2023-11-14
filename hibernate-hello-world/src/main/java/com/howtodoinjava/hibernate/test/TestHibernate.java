package com.howtodoinjava.hibernate.test;

import org.hibernate.Session;

public class TestHibernate {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();       
		//Add new Employee object
		EmployeeEntity emp = new EmployeeEntity();
		emp.setEmployeeId(123457);
		emp.setEmail("manikandan1.marimuthu@gmail.com");
		emp.setFirstName("Manikandan-1");
		emp.setLastName("Marimuthu-1");
		
		session.save(emp);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Execution completed");
	}

}
