package com.lti.SpringDependency_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	private Employee employee;
	private Department department;
	

	public Company(Department department) {
		this.department = department;
	}
	
	
	@Autowired                      //Autowiring by setter method
	public void setDepartment(Department department) {
		this.department = department;
	}


	public void showDepartmentInfo() {
		department.showDepartmentInfo();
	}

	@Autowired       //Autowiring by Constructor
	public Company(Employee employee) {
		this.employee = employee;
	}
	
	public void showEmployeeInfo() {
		employee.showEmployeeInfo();
	}
	
}
