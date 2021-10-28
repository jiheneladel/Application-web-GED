package com.pfe.Models;

public class User {
	private int id;
	private String login;
	private String password;
	private int id_employer;
	private String type;
	public User(String login, String password, int id_employer, String type) {
		super();
		this.login = login;
		this.password = password;
		this.id_employer = id_employer;
		this.type = type;
	}
	public User() {
		super();
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_employer() {
		return id_employer;
	}
	public void setId_employer(int id_employer) {
		this.id_employer = id_employer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", id_employer=" + id_employer
				+ ", type=" + type + "]";
	}
	
}
