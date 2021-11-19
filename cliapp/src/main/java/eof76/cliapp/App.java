package eof76.cliapp;

import eof76.dal.entities.User;
import eof76.dal.repositories.UserRepository;
import eof76.dal.repositories.UserRepositoryHibernate;

public class App {

	public static void main(String[] args) {
		UserRepository repo = new UserRepositoryHibernate();
		
		Iterable<User> users = repo.getAll();
		
		for (User user: users) {
			System.out.println(user);
		}
	}
}
