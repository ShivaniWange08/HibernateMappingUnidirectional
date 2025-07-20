package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Students;
import com.mapping.Utility.HibernateUtility;

public class AppDeleteById {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Students s = session.find(Students.class, 5);
		session.remove(s);

		transaction.commit();
		session.close();
	}
}
