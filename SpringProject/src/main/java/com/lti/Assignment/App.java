package com.lti.Assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		EmployeeDetails employ=(EmployeeDetails) context.getBean("emp1");
		Department depta=(Department) context.getBean("dept");
		
		employ.SalaryDetails();
		
	}

}
