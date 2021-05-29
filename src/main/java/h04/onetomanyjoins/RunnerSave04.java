package h04.onetomanyjoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave04 {

	public static void main(String[] args) {
		
		Books04 b1 = new Books04(11, "Math Book");
		Books04 b2 = new Books04(12, "Science Book");
		Books04 b3 = new Books04(13, "Java Book");
		Books04 b4 = new Books04(14, "Art Book");
		
		Students04 std1 = new Students04(101, "Ali Can", 10);
		std1.getBooksList().add(b1);
		std1.getBooksList().add(b2);
		std1.setBooksList(std1.getBooksList());
		
		/*
		 	Note: In OneToMany relationship,
		 	Parent Class can have multiple children but Child Class cannot have multiple parents.
		 	So, A stduent can have multiple books, but a book cannot have multiple studnet owners.
		 	If you try to add multiple owner for a book, Hibernate does not give any error, it just accepts
		 	last owner as valid owner 
		 */
		
		Students04 std2 = new Students04(102, "Veli Han", 9);
		//std2.getBooksList().add(b2);
		std2.getBooksList().add(b3);
		std2.getBooksList().add(b4);
		
		Students04 std3 = new Students04(103, "Ayse Tan", 8);
		
		b1.setStudent(std1);
		b2.setStudent(std1);
		
		//b2.setStudent(std2);
		b3.setStudent(std2);
		b4.setStudent(std2);
		
		Configuration con = new Configuration().
											configure("hibernate.cfg.xml").
											addAnnotatedClass(Students04.class).
											addAnnotatedClass(Books04.class);

		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
			
		tx.commit();

	}

}
