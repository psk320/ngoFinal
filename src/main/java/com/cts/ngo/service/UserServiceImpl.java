package com.cts.ngo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.User;
import com.cts.ngo.dao.UserDAO;

@Service("customerservice")
public class UserServiceImpl implements Userservice {
@Autowired
UserDAO c;
@Transactional
public List<User> getUsers() {
              // TODO Auto-generated method stub
              return c.getUsers();
       }
       @Transactional
      public void saveUser(User theuser) {
              // TODO Auto-generated method stub
              c.saveUser(theuser);
       }
//      @Transactional
//     public customer getCustomer(int theId) {
//              // TODO Auto-generated method stub
//    	  return c.getCustomer(theId);
//       }
//      @Transactional
//      public void deleteCustomer(int theId) {
//              // TODO Auto-generated method stub
//              c.deleteCustomer(theId);
//       }
	

}
