package com.cts.ngo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.Ngo;
import com.cts.ngo.dao.NgoDAO;

@Service("ngoservice")
public class NgoServiceImpl implements Ngoservice {
@Autowired
NgoDAO c;
@Transactional
public List<Ngo> getNgos() {
              // TODO Auto-generated method stub
              return c.getNgos();
       }
       @Transactional
      public void saveNgo(Ngo thengo) {
              // TODO Auto-generated method stub
              c.saveNgo(thengo);
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
