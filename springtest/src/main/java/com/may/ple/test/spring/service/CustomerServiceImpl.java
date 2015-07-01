package com.may.ple.test.spring.service;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public String calculate(int x) throws Exception {
		String result = null;
		
		try {
			result = "" + (x * 5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
