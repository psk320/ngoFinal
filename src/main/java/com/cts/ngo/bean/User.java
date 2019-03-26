package com.cts.ngo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	@Column(name="username")
	String firstName;
	@Column(name="last_name")
	String lastName;
	@Column(name="email")
	String e_mail;
	@Column(name="age")
	String age;
	@Column(name="gender")
	String gender;
	@Column(name="password")
	String password;
	@Column(name="confirmpass")
	String confirmpass;
	
	public User(){}

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		return "user [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", e_mail=" + e_mail
				+ ", age=" + age + ", gender=" + gender + ", password=" + password + ", confirmpass=" + confirmpass
				+ "]";
	}
	
	
	
}
