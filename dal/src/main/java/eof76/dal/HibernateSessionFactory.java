package eof76.dal;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import eof76.dal.entities.User;

public class HibernateSessionFactory {
	private static SessionFactory sessionFactory = buildSessionFactory();
	
	protected static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
        configuration.configure();

        return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}
}
