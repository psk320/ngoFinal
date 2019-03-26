package com.cts.ngo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.Ngo;

public interface Ngoservice {
	@Transactional  
	public List<Ngo> getNgos();
	public void saveNgo(Ngo theNgo);
	//public user getUser(int theId);
	//public void deleteCustomer(int theId);
	
}
