package com.cts.ngo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.Subscribe;
import com.cts.ngo.dao.SubscribeDAO;



@Service("subscribeservice")
public class SubscribeServiceImpl implements Subscribeservice {
@Autowired
SubscribeDAO c;
@Transactional
public List<Subscribe> getSubscribes() {
              // TODO Auto-generated method stub
              return c.getSubscribes();
       }
       @Transactional
      public void saveSubscribe(Subscribe thesubscribe) {
              // TODO Auto-generated method stub
              c.saveSubscribe(thesubscribe);
       }
}