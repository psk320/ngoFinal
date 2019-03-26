package com.cts.ngo.dao;
import java.util.*;

import com.cts.ngo.bean.Subscribe;
public interface SubscribeDAO {
public List<Subscribe> getSubscribes();
public void saveSubscribe(Subscribe theSubscribe);
}