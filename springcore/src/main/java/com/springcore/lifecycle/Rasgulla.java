
// using @ annotations
package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Rasgulla {
	
	private String taste;

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		
		System.out.println("setting");
		this.taste = taste;
	}

	public Rasgulla() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rasgulla [taste=" + taste + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Ending method");
	}
	
	
}
