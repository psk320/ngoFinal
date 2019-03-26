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

import com.cts.ngo.bean.Ngo;
import com.cts.ngo.service.Ngoservice;


@Controller 
@RequestMapping("/ngo")
public class Ngocontroller {
@Autowired
Ngoservice  ngoService;
@GetMapping("/list")
public String listCustomer(Model theModel){
	
	List<Ngo> thengos=ngoService.getNgos();
	theModel.addAttribute("ngo", thengos);
   return "list-customers1";
	
	
}

@GetMapping("/showForm")
public String showFormForAdd(Model theModel){
	Ngo theNgo=new Ngo();
	theModel.addAttribute("ngo", theNgo);
	return "ngologin";
	
}
@PostMapping("/saveNgo")
public String saveNgo(@ModelAttribute("ngo") Ngo theNgo){
	ngoService.saveNgo(theNgo);
	return "redirect:/ngo/list";
}
}
