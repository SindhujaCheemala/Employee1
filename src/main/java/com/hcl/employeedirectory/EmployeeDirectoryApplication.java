package com.hcl.employeedirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EmployeeDirectoryApplication extends  SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(EmployeeDirectoryApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeDirectoryApplication.class, args);
	}
	

}