package com.cts.ngo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.Event;
import com.cts.ngo.dao.EventDAO;


@Service("eventservice")
public class EventServiceImpl implements Eventservice {
@Autowired
EventDAO c;
@Transactional
		public List<Event> getEvents() {
              // TODO Auto-generated method stub
              return c.getEvents();
       }
       @Transactional
      public void saveEvent(Event theevent) {
              // TODO Auto-generated method stub
              c.saveEvent(theevent);
       }
      @Transactional
     public Event getEvent(int theId) {
              // TODO Auto-generated method stub
    	  return c.getEvent(theId);
       }
      @Transactional
      public void deleteEvent(int theId) {
              // TODO Auto-generated method stub
              c.deleteEvent(theId);
       }

}

