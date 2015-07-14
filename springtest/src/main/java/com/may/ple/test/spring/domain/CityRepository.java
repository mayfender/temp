package com.may.ple.test.spring.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long> {
	
	@Query("select u.name from City u where u.name = ?1")
	public List<City> findByName(String name);

}
