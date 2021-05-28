package h01.annotations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

	public static void main(String[] args) {
		
		Students01 std1 = new Students01(101, "Ali Can", 11);
		Students01 std2 = new Students01(102, "Aliye Can", 9);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students01.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Transaction tx = s1.beginTransaction();
		
		s1.save(std1);
		s1.save(std2);
		
		tx.commit();

	}

}
