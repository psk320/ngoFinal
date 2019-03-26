package com.cts.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.ngo.bean.Subscribe;
import com.cts.ngo.service.Subscribeservice;
@Controller 
@RequestMapping("/subscribe")
public class Subscribecontroller {
@Autowired
Subscribeservice  subscribeService;
@GetMapping("/list")
public String listCustomer(Model theModel){
	
	List<Subscribe> thesubscribes=subscribeService.getSubscribes();
	theModel.addAttribute("event", thesubscribes);
   return "list-customers3";
	
	
}

@GetMapping("/showForm")
public String showFormForAdd(Model theModel){
	Subscribe theSubscribe=new Subscribe();
	theModel.addAttribute("subscribe", theSubscribe);
	return "eventngo";
	
}
@PostMapping("/saveSubscribe")
public String saveSubscribe(@ModelAttribute("subscribe") Subscribe theSubscribe){
	subscribeService.saveSubscribe(theSubscribe);
	return "redirect:/subscribe/list";
}
}
