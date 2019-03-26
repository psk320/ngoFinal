package com.cts.ngo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.LoginUser;
import com.cts.ngo.dao.LoginDAO;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDAO loginDAO;

	@Override
	public int authenticateUser(LoginUser login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateUser(login);
	}

}
