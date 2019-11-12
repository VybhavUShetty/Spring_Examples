package com.lti.Spring_Jdbc_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Spring_Jdbc.personEntity.Person;
import com.lti.Spring_Jdbc_Dao.PersonDao;

@Service("personService")
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonDao personDao;
	
	public void addPerson(Person person) {
		personDao.addPerson(person);
	}



	public void editPerson(Person person, int personid) {
		personDao.editPerson(person, personid);
		
	}

	public void deletePerson(int personid) {
		personDao.deletePerson(personid);
		
	}

	public Person find(int personId) {
		
		return personDao.find(personId);
	}
	public List<Person> findAll() {
		
		return personDao.findAll();
	}
	
	
	

}
