package com.cts.ngo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.User;

public interface Userservice {
	@Transactional  
	public List<User> getUsers();
	public void saveUser(User theUser);
	//public user getUser(int theId);
	//public void deleteCustomer(int theId);
	
}
