package com.lti.Sting.Annotation;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext appcon=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
       Country countryObj=(Country) appcon.getBean("Obj");
       String countryName=countryObj.getCountryName();
       
       System.out.println("countryName:"+countryName);
    }
}
