package com.lti.Example2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("trainee.xml");
		Trainee trainee=(Trainee) context.getBean("tra");
		//Department depta=(Department) context.getBean("dept");
		
		System.out.println(trainee.getTname());
		System.out.println(trainee.getTid());
		

}
}
