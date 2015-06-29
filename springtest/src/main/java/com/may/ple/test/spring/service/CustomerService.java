package com.may.ple.test.spring.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	public String calculate(int x) {
		return ""+(x * 10);
	}

}
