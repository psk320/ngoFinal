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

import com.cts.ngo.bean.User;

@Repository("userDAO")
public class UserDAOimpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<User> getUsers() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<User> cq=cb.createQuery(User.class);
		Root<User> root=cq.from(User.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
		
	}

	
	

	public void saveUser(User theUser) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theUser);
		
	}

//public customer getCustomer(int theId) {
//		// TODO Auto-generated method stub
//	Session currentSession=sessionFactory.getCurrentSession();
//		customer theCustomer=currentSession.get(customer.class, theId);
//	
//		return theCustomer;
//	}
////
//	public void deleteCustomer(int theId) {
//		// TODO Auto-generated method stub
//		Session currentSession=sessionFactory.getCurrentSession();
//		customer book=currentSession.byId(customer.class).load(theId);
//		
//	currentSession.delete(book);
//	customer theCustomer=currentSession.get(customer.class, theId);
//		
//		
//	}


}