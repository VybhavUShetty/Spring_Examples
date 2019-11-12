package com.lti.Spring.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
	
	@Bean(name="student")
	public Student getStudent_name() {
		return new Student(1,"mukul");
	}
	
	
	

}
