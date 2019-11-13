package com.lti.Spring_Jpa.Jpa_Example;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.Spring_Jpa.Config.AppConfig;
import com.lti.Spring_Jpa.service.PersonService;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService=context.getBean(PersonService.class);
        
        personService.add(new Person("Sachin","Tendulkar","sachin@gmail.com"));
        personService.add(new Person("Vybhav","Shetty","vybhav@gmail.com"));
        personService.add(new Person("Karan","Singh","Karan@gmail.com"));
        personService.add(new Person("Neha","Khakkar","sachin@gmail.com"));
        
        List<Person> persons=personService.listPersons();
        for(Person person:persons) {
        	System.out.println("Id="+person.getId());
        	System.out.println("FirstName="+person.getFirstName());
        	System.out.println("LastName="+person.getLastName());
        	System.out.println("Email="+person.getEmail());
        	System.out.println();
        	
        }
        context.close();
        
}
}
