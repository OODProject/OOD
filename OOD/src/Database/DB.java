package Database;


import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

//import org.hibernate.Session;
//import org.hibernate.Transaction;


public class DB {
	/*public static void main(String[] args) {
		createSomeData();
		//System.out.println("learniing");
		// showWelcomePage();
		// UUID.fromString("970b167a-3224-4527-83cb-accb7d493e72");
		// System.out.println(UUID.randomUUID());

	}*/
	public static void callDB(){
		createSomeData();
	}
	private static void createSomeData() {
		Session session = null;
		Transaction tx = null;
		try {
			session = new HibernateUtil().getSession();
			tx = session.beginTransaction();

			Student user=new Student("ali", "ahmadi", "t");
			session.save(user);
		      //conn = DriverManager.getConnection(MY_DB, "root", "root");

			long now = new Date().getTime();
			//ActionEntity action1 = new ActionEntity("Go to park",
				//	new Timestamp(now), user.getGuid());
			////ActionEntity action2 = new ActionEntity("Play some music",
			//		new Timestamp(now), user.getGuid());
			// System.out.println("hi there");
			//session.save(action1);
			//session.save(action2);

			tx.commit();
			System.out.println("Everything saved successfully");
		} catch (Exception ex) {
			if (tx != null)
				tx.rollback();
			throw new RuntimeException(ex);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

