package com.lti.SpringDependency_Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.lti.SpringDependency_Autowired")
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		return new EmployeeImpl();
	}
	
	@Bean
	public Department getDepartment() {
		return new DepartmentImpl();
	}
	

}

