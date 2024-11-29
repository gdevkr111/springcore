package com.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcollection/config2.xml");
	
	Employees emp=(Employees)context.getBean("employee1");
	
	System.out.println(emp.getName());
	System.out.println(emp.getPhones());
	System.out.println(emp.getAddress());
	System.out.println(emp.getCourses());
	System.out.println(emp.getProps());
	
	System.out.println(emp);
	
	
	
}
}
