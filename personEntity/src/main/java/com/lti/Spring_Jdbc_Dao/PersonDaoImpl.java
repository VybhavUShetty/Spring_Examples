package com.lti.Spring_Jdbc_Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.Spring_Jdbc.personEntity.Person;

@Repository  //mentions that the class is used for database CRUD functionalities 
@Qualifier("personDao")   //qualifier mentions that if we have same name of id to avoid the conflict of same names we use @Qualifier
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;  //API used for creating core jdbc 

	public void addPerson(Person person) {
		jdbcTemplate.update("INSERT INTO person (person_id,first_name,last_name,age) "
				+ "VALUES(?,?,?,?)",person.getPersonid(),person.getFirstName(),person.getLastName(),person.getAge());
		System.out.println("Person Inserted!!!");
	}
	
	
	
	

	public void editPerson(Person person, int personid) {
	jdbcTemplate.update("UPDATE person SET first_name=?,last_name=?,age=? where person_id=?",person.getFirstName(),person.getLastName(),person.getAge(),personid);
	System.out.println("Person Updated!!!");
		
	}

	public void deletePerson(int personid) {
		jdbcTemplate.update("Delete from person where person_id=?",personid);
		System.out.println("Person Deleted!!!");
	}
	@SuppressWarnings("unchecked")
	public Person find(int personId) {
		@SuppressWarnings("rawtypes")
		Person person=(Person)jdbcTemplate.queryForObject("SELECT * FROM person WHERE "
				+ "person_id=?", new Object[] {personId},new BeanPropertyRowMapper(Person.class));
		
		return person;
	}
	@SuppressWarnings("rawtypes")
	public List<Person> findAll() {
		@SuppressWarnings("unchecked")
		List<Person> persons=jdbcTemplate.query("SELECT * FROM person",new BeanPropertyRowMapper(Person.class) );
		
		return persons;
	}
	

}
