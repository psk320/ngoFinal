package com.cts.ngo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginUser {
	@Id
	private String name;
	private String password;
	private String userType;
	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUser(String name, String password, String userType) {
		super();
		this.name = name;
		this.password = password;
		this.userType = userType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
}
