package com.lti.SpringCollectionEx;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {
	
	@Bean
	public CollectionsBean getCollectionsBean(){
		return new CollectionsBean();
	}

	@Bean
	public List<String> nameList() {
	return Arrays.asList("John","Vybhav","Mukul");	
	}
	
}
