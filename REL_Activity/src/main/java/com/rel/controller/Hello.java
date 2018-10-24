package com.rel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rel.service.HelloService;

/**
 * @Description: 
 * @author xujunjie
 * @date 2018年10月24日
 */
@Controller
public class Hello {
	
	@Autowired
	private HelloService helloService;

	@RequestMapping("hi")
	public String hello() {
		String num = "R002";
		String user = helloService.queryUser(num);
		System.out.println(user);
		return "hello";
	}
}
