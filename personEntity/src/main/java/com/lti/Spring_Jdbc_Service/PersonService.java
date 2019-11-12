package com.lti.Spring_Jdbc_Service;

import java.util.List;

import com.lti.Spring_Jdbc.personEntity.Person;



public interface PersonService {
	public void addPerson(Person person);
	public void editPerson(Person person,int personid);
	public void deletePerson(int personid);
	public Person find(int personId);
	public List<Person> findAll();

}
