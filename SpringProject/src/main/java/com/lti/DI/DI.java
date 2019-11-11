package com.lti.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DI {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Dependency.xml");
		Car v=(Car) ctx.getBean("Car");
		
		
		MRF m=(MRF) ctx.getBean("MRF");
		v.move();
		m.rotate();
	

	}

}
