package com.lti.Spring_Jpa.service;

import java.util.List;

import com.lti.Spring_Jpa.Jpa_Example.Person;

public interface PersonService {
	void add(Person person);
	List<Person>listPersons();


}
