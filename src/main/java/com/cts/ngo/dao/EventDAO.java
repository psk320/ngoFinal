package com.cts.ngo.dao;
import java.util.*;

import com.cts.ngo.bean.Event;


public interface EventDAO {
public List<Event> getEvents();
public void saveEvent(Event theEvent);
public Event getEvent(int theId);
public void deleteEvent(int theId);
}

