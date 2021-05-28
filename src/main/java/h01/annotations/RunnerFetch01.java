package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {
		
		Students01 stdRead = new Students01();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students01.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		stdRead = s1.get(Students01.class, 101);

		tx.commit();

		System.out.println(stdRead);
	}

}
