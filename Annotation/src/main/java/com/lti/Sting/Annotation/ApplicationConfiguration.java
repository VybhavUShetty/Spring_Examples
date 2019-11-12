package com.lti.Sting.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name="Obj")
	public Country getCountry() {
		return new Country("India");
	}
	

}
