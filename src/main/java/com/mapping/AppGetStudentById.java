package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Students;
import com.mapping.Utility.HibernateUtility;

public class AppGetStudentById {

	public static void main(String[] args) {
		System.out.println("Get Data by Id");
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int id = 1;
		Students students = session.find(Students.class, id);

		transaction.commit();
		session.close();
		System.out.println("DATA for student with id " + id + " : " + students.toString());
	}

}