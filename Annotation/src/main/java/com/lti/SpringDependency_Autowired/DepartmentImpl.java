package com.lti.SpringDependency_Autowired;

import java.util.Scanner;

public class DepartmentImpl implements Department{

	public void showDepartmentInfo() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Dept");
		String name=scan.next();
		System.out.println("Enter the hod name");
		String name1=scan.next();
		System.out.println("Dept name:"+name);
		System.out.println("hod name:"+name1);
		

		
		
	}

}
