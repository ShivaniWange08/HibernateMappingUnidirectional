package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Documents;
import com.mapping.Entity.Students;
import com.mapping.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = HibernateUtility.getSessionFactory();
        Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Documents documents = new Documents();
		documents.setAadharNo(2732945);
		documents.setPanNo("Ck2630");
		
		Students students = new Students(); 
		students.setfName("Om");
		students.setlName("Wange");
		students.setDocuments(documents);
		
		session.persist(students);
		
		transaction.commit();
		session.close();
    }
}
