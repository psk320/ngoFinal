package com.cts.ngo.service;

import com.cts.ngo.bean.LoginUser;

public interface LoginService {
	public int authenticateUser(LoginUser login);
}
