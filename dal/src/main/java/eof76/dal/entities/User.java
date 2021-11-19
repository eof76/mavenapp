package eof76.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="users")
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password_hash")
	private String passwordHash;
	
	@Column(name="salt")
	private String salt;
	
	public User() {
	}

	public User(int id, String login, String passwordHash, String salt) {
		this.id = id;
		this.login = login;
		this.passwordHash = passwordHash;
		this.salt = salt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login='" + login + "', passwordHash='" + passwordHash + "', salt='" + salt + "']";
	}
	
}
