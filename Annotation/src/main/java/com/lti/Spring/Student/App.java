package com.lti.Spring.Student;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ApplicationContext appcon1=new AnnotationConfigApplicationContext(StudentConfiguration.class);
       Student countryObj=(Student) appcon1.getBean("student");
       String countryName=countryObj.getStudent_name();
     int countryName1=countryObj.getStudentid();
       
       System.out.println("Student Name:"+countryName);
      System.out.println("Student id:"+countryName1);
      
      
      
    }
}
