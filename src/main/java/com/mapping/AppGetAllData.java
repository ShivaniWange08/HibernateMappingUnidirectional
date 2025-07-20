package com.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Students;
import com.mapping.Utility.HibernateUtility;

public class AppGetAllData {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Students> studentList = session.createQuery("select s FROM Students s", Students.class).getResultList();

		studentList.stream().forEach(k -> System.out.println(k.toString()));

		transaction.commit();
		session.close();

	}

}
