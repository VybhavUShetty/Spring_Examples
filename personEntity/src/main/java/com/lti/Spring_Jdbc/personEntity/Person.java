package com.lti.Spring_Jdbc.personEntity;

public class Person {
	private int personid;
	private String firstName;
	private String lastName;
	private int age;
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int personid, String firstName, String lastName, int age) {
		super();
		this.personid = personid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	public Person() {
		
	}
	
	

}
