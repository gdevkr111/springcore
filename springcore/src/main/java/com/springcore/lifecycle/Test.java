package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		context.registerShutdownHook();

	/*	Samosa s = (Samosa) context.getBean("s1");
		System.out.println(s);
                                                                                                             
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);   */

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++"); 
		
		Rasgulla r = (Rasgulla) context.getBean("r1");
		System.out.println(r);
	}
}
