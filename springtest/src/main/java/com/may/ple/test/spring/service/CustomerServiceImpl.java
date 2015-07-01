package com.may.ple.test.spring.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public String calculate(int x) throws Exception {
		return ""+(x * 10000);
	}

}
