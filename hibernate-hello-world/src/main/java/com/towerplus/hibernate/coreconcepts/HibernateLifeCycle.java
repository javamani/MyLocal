package com.towerplus.hibernate.coreconcepts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.howtodoinjava.hibernate.test.HibernateUtil;
import com.towerplus.hibernate.entity.Student;

public class HibernateLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Object is in Transient state.
		 *  Not associate with the database.
		 */
		Student student = new Student();	
		 Transaction  transaction = null;
		try {
			System.out.println("Hibernate execution started");
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			student.setStudentID(1001);
			student.setFirstName("Mani-Id updated");
			student.setLastName("LastName");	
		//	employee.setEmail("Welcome@happylearning.com");
			/*
			 * Object is in persistent state.
			 * represent a row in the database
			 */
			//session.save(employee);
			session.saveOrUpdate(student);
		
			/*
			 * Object is in Detach state.
			 * Can be reattached by using save method on a new session for the detached entity.
			 */
			transaction.commit();
			System.out.println("Employee created");
		//	session.close();
			/*
			// Reattaching a detached object.
			Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
			System.out.println("Object got reattached");
			session.load(employee, session2);
			session2.evict(employee);
			
			System.out.println("Hibernate execution completed");
			transaction.commit();
			*/
			System.out.println("Employee persisted");
		} catch (Exception e) {
			if (transaction != null) {
	            transaction.rollback();
	        }
		}
		
		

	}

}
