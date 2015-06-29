package com.may.ple.test.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.may.ple.test.spring.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerServic;

	@RequestMapping("/hello")
	public String hello() {
		String restult = customerServic.calculate(5);
		return "########## " + restult;
	}

}
