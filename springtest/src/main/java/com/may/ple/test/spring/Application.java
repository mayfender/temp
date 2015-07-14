package com.may.ple.test.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer {
	
	// Entry point for application
	public static void main(String[] args) {
		System.out.println("Start Application...");
		SpringApplication.run(Application.class, args);
	}
	
	// Entry point Servlet Engine
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Application init #### mayfender.");
	}
	
	@Bean
	@ConfigurationProperties(prefix="datasource.primary")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@PreDestroy
	public void destroy() {
		
	}

}
