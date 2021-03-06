package com.lti.Spring_Jpa.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.Spring_Jpa.Jpa_Dao.PersonDao;
import com.lti.Spring_Jpa.Jpa_Example.Person;

public class PersonServiceImp implements PersonService{
	
	@Autowired
	private PersonDao userDao;
	
	
	@Transactional
	public void add(Person person) {
		userDao.add(person);
		
	}
	@Transactional(readOnly=true)
	public List<Person> listPersons() {
		
		return userDao.listPersons();
	}

}
