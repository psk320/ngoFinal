package com.cts.ngo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.Event;



public interface Eventservice {
	
@Transactional  
	public List<Event> getEvents();
	public void saveEvent(Event theEvent);
	public Event getEvent(int theId);
	public void deleteEvent(int theId);
	
}
