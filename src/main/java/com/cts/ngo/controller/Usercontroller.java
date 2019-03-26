package com.cts.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.ngo.bean.User;
import com.cts.ngo.service.Userservice;


@Controller 
@RequestMapping("/user")
public class Usercontroller {
@Autowired
Userservice  userService;
@GetMapping("/list")
public String listCustomer(Model theModel){
	
	List<User> theusers=userService.getUsers();
	theModel.addAttribute("user", theusers);
   return "list-customers";
	
	
}

@GetMapping("/showForm")
public String showFormForAdd(Model theModel){
	User theUser=new User();
	theModel.addAttribute("user", theUser);
	return "userlogin";
	
}
@PostMapping("/saveUser")
public String saveUser(@ModelAttribute("user") User theUser){
	userService.saveUser(theUser);
	return "redirect:/user/list";
}
//@GetMapping("/updateForm")
//public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel){
//	customer theCustomer=customerService.getCustomer(theId);
//	theModel.addAttribute("customer", theCustomer);
//	return"customer-form";
//}
//@GetMapping("/delete")
//public String deleteCustomer(@RequestParam("customerId") int theId){
//	customerService.deleteCustomer(theId);
//	return"redirect:/customer/list";
//}

}