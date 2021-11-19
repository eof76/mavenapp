package eof76.dal.repositories;

import org.hibernate.Session;
import org.hibernate.query.Query;

import eof76.dal.HibernateSessionFactory;
import eof76.dal.entities.User;

public class UserRepositoryHibernate implements UserRepository {

	@SuppressWarnings("unchecked")
	@Override
	public Iterable<User> getAll() {
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Query<User> query = session.createQuery("from users order by login");
		
		Iterable<User> users = query.list();
		session.close();
		return users;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOrUpdate(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int i) {
		// TODO Auto-generated method stub
		
	}

}
