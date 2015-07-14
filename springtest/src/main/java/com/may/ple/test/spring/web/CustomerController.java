package com.may.ple.test.spring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.may.ple.test.spring.domain.City;
import com.may.ple.test.spring.domain.CityRepository;
import com.may.ple.test.spring.service.CustomerService;

@RestController
public class CustomerController {
	private CustomerService customerServic;
	private CityRepository cityRepository;

	@Autowired
	public CustomerController(CustomerService customerServic,
			CityRepository cityRepository) {
		this.customerServic = customerServic;
		this.cityRepository = cityRepository;
	}
	
	@RequestMapping("/save")
	public String save() {
		
		cityRepository.save(new City("A", "AA", "AAA"));
		
		return "Success";
	}
	
	@RequestMapping("/findCity")
	public List<City> findCity() {
		
		List<City> citys = cityRepository.findByName("A");
		System.out.println(citys.size());
		
		return citys;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		String restult = null;
		
		try {
			restult = customerServic.calculate(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "########## " + restult;			
	}

}
