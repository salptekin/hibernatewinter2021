package h04.onetomanyjoins;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {

		Students04 stdRead = new Students04();
		Books04 bRead = new Books04();

		Configuration con = new Configuration().
								configure("hibernate.cfg.xml").
								addAnnotatedClass(Students04.class).
								addAnnotatedClass(Books04.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		

		tx.commit();

	}

}
