package com.lti.SpringCollection.Set;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {
	
	@Bean
	public CollectionsBean getCollectionsBean(){
		return new CollectionsBean();
	}

	@Bean
	public HashSet<String> nameSet() {
		 HashSet<String> hset = 
	               new HashSet<String>();
			hset.add("vybhav");
		
	hset.add("mukul");

	hset.add("vicky");
	return hset;
	}


}
