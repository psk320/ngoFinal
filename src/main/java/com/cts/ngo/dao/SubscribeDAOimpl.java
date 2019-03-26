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

import com.cts.ngo.bean.Subscribe;

@Repository("subscribeDAO")
public class SubscribeDAOimpl implements SubscribeDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Subscribe> getSubscribes() {
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Subscribe> cq=cb.createQuery(Subscribe.class);
		Root<Subscribe> root=cq.from(Subscribe.class);
		cq.select(root);
		Query query=session.createQuery(cq);
		return query.getResultList();
		
	}

	public void saveSubscribe(Subscribe theSubscribe) {
		// TODO Auto-generated method stub
		Session currentSession=sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theSubscribe);
	}

}