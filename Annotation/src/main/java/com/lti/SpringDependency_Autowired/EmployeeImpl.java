package com.lti.SpringDependency_Autowired;

import java.util.Scanner;

public class EmployeeImpl implements Employee{

	public void showEmployeeInfo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee name");
		String name=scan.next();
		System.out.println("Enter the address");
		String name1=scan.next();
		System.out.println(" name:"+name);
		System.out.println("addresss:"+name1);
		
		
	}

}
