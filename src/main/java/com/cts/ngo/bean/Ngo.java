package com.cts.ngo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ngo")
public class Ngo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="username")
	String firstName;
	@Column(name="email")
	String e_mail;
	@Column(name="date")
	String date;
	@Column(name="password")
	String password;
	@Transient
	String confirmpass;
	
	
	public Ngo()
	{
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getE_mail() {
		return e_mail;
	}


	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmpass() {
		return confirmpass;
	}


	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}


	@Override
	public String toString() {
		return "ngo [id=" + id + ", firstName=" + firstName + ", e_mail=" + e_mail + ", date=" + date + ", password="
				+ password + ", confirmpass=" + confirmpass + "]";
	}
	
	
}