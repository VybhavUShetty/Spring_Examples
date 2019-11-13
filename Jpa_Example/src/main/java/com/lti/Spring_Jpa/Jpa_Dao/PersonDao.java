package com.lti.Spring_Jpa.Jpa_Dao;

import java.util.List;

import com.lti.Spring_Jpa.Jpa_Example.Person;

public interface PersonDao {
	public void add(Person person);
	public List<Person> listPersons();
	
} 
