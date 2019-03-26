package com.cts.ngo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cts.ngo.bean.Subscribe;



public interface Subscribeservice {
	
@Transactional  
	public List<Subscribe> getSubscribes();
	public void saveSubscribe(Subscribe theSubscribe);
}