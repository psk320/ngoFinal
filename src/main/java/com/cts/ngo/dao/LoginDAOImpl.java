package com.cts.ngo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.LoginUser;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int authenticateUser(LoginUser login) {
		try{
					
				String userName = login.getName();
				String password = login.getPassword();
				String userType = login.getUserType();
				Session session = sessionFactory.getCurrentSession();
				String query = "from LoginUser where name = ? and password = ? and userType = ?";
				Query<LoginUser> query2 = null;
				query2=session.createQuery(query);
				query2.setParameter(0,userName);  
				query2.setParameter(1,password);  
				query2.setParameter(2, userType);
				LoginUser user= query2.getSingleResult();
				if(user!=null)
				{
					return 1;
				}
				else
				{
					return 0;
					}
				}
				catch(Exception e)
				{
					//e.printStackTrace();
					return 0;
				}
			}

}
