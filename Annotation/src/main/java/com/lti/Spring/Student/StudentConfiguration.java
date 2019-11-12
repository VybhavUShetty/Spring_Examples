package com.lti.Spring.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lti.Sting.Annotation.ApplicationConfiguration;
import com.lti.Sting.Annotation.Country;

@Configuration
public class StudentConfiguration {
	
	@Bean(name="student")
	public Student getStudent_name() {
		return new Student(1,"mukul");
	}
	
	
	
	@Configuration
	
	public class ConfigTwo {
		@Autowired 
		Country c;

	    @Bean
	    public Country transferService() {
	         // transferService references accountRepository in a 'fully-qualified' fashion:
	        return new Country(c.getCountryName());
	    }
	}
	
	

}
