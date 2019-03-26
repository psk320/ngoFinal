package com.cts.ngo.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.ngo.bean.Event;


@Repository("eventDAO")
public class EventDAOimpl implements EventDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Event> getEvents() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Event> cq=cb.createQuery(Event.class);
		Root<Event> root=cq.from(Event.class);
		cq.select(root);
		cq.orderBy(cb.asc(root.get("date")));
		Query query=session.createQuery(cq);
		return query.getResultList();
		
	}

	
	

	public void saveEvent(Event theEvent) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theEvent);
		
	}

public Event getEvent(int theId) {
	// TODO Auto-generated method stub	
	Session currentSession=sessionFactory.getCurrentSession();
		Event theEvent=currentSession.get(Event.class, theId);
	
		return theEvent;
	}

	public void deleteEvent(int theId) {
	// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		Event book=currentSession.byId(Event.class).load(theId);
		
	currentSession.delete(book);
	Event theEvent=currentSession.get(Event.class, theId);
	
		
	}




}