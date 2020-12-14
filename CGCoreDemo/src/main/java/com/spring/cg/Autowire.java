package com.spring.cg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire {

	public static void main(String[] args) {
		AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("AutowireDemo_Beans.xml");
		EmployeeBean emp1 = (EmployeeBean)iocContainer.getBean("Employee1");
		System.out.println("Autowired by Type : Employee "+ emp1);
		   
		EmployeeBean emp2 = (EmployeeBean)iocContainer.getBean("Employee2");
		System.out.println("Autowired by Type : Employee "+ emp2);
	}

} 