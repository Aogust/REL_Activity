package com.rel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rel.dao.HelloMapper;

/**
 * @Description: 
 * @author xujunjie
 * @date 2018年10月24日
 */

@Service
public class HelloService {
	
	@Autowired
	private HelloMapper helloMapper;

	public String queryUser(String num) {
		// TODO Auto-generated method stub
		return helloMapper.queryUser(num);
	}

}
