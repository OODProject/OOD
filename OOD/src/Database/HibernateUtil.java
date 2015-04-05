package Database;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory ourSessionFactory;
	private static final ServiceRegistry serviceRegistry;

	static {
		try {
			// System.out.println("dkfdkf");

			Configuration configuration = new Configuration();
			configuration
				.addResource("resources/Student.hbm.xml");
			configuration.configure("/resources/hibernate.cfg.xml");
			// "/resources/hibernate.cfg.xml
			// configuration.configure("hibernate.cfg.xml");
			/*
			 * configuration.setProperty("hibernate.connection.username",
			 * "OODUser");
			 * configuration.setProperty("hibernate.connection.password",
			 * "1234");
			 */
			System.out.println("dkfdkf");

			serviceRegistry = new ServiceRegistryBuilder().applySettings(
					configuration.getProperties()).buildServiceRegistry();
			ourSessionFactory = configuration
					.buildSessionFactory(serviceRegistry);
			// System.out.println("Hi");
			// System.out.println(ourSessionFactory.toString());
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public Session getSession() throws HibernateException {
		return ourSessionFactory.openSession();
	}
}
