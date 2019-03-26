package com.cts.ngo.dao;

import com.cts.ngo.bean.LoginUser;

public interface LoginDAO {

	public int authenticateUser(LoginUser login);
	
}
