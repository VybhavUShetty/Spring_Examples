package com.lti.SpringCollection.Set;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class CollectionsBean {
	
	@Autowired
	private Set<String> nameSet;
	
	public void printNameSet() {
		System.out.println(nameSet);
	}

}
