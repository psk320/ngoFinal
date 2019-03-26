package com.cts.ngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.ngo.bean.LoginUser;
import com.cts.ngo.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView validateUser(LoginUser loginUser){
		ModelAndView modelAndView = new ModelAndView();
		if(loginService.authenticateUser(loginUser)==1)
     	{
			if("admin".equals(loginUser.getUserType()))
				modelAndView.setViewName("homepage");
			else if("user".equals(loginUser.getUserType()))
				modelAndView.setViewName("homepage1");
			else
				modelAndView.setViewName("homepage2");
     	}
		else
		{
			modelAndView.setViewName("index");
			
		}	
		return modelAndView;
	}
	
}
