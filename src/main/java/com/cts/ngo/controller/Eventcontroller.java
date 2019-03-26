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

import com.cts.ngo.bean.Event;
import com.cts.ngo.service.Eventservice;

@Controller 
@RequestMapping("/event")
public class Eventcontroller {
@Autowired
Eventservice  eventService;
@GetMapping("/list")
public String listCustomer(Model theModel){
	
	List<Event> theevents=eventService.getEvents();
	theModel.addAttribute("event", theevents);
   return "list-customers2";
	
	
}

@GetMapping("/showForm")
public String showFormForAdd(Model theModel){
	Event theEvent=new Event();
	theModel.addAttribute("event", theEvent);
	return "event1";
	
}
@PostMapping("/saveEvent")
public String saveEvent(@ModelAttribute("event") Event theEvent){
	eventService.saveEvent(theEvent);
	return "redirect:/event/list";
}

@GetMapping("/updateForm")
public String showFormForUpdate(@RequestParam("eventId") int theId,Model theModel){
	Event theEvent=eventService.getEvent(theId);
	theModel.addAttribute("event", theEvent);
	return"event1";
}
@GetMapping("/delete")
public String deleteEvent(@RequestParam("eventId") int theId){
	eventService.deleteEvent(theId);
	return"redirect:/event/list";
}
}
