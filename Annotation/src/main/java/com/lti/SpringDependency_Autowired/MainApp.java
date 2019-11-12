package com.lti.SpringDependency_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lti.Spring.Student.StudentConfiguration;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appcon1=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Company company=appcon1.getBean(Company.class);
		company.showDepartmentInfo();
		company.showEmployeeInfo();
		appcon1.close();

	}

}
