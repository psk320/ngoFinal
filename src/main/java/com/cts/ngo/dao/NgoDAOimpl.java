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

import com.cts.ngo.bean.Ngo;

@Repository("ngoDAO")
public class NgoDAOimpl implements NgoDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Ngo> getNgos() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Ngo> cq=cb.createQuery(Ngo.class);
		Root<Ngo> root=cq.from(Ngo.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
		
	}

	
	

	public void saveNgo(Ngo theNgo) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theNgo);
		
	}








	
}