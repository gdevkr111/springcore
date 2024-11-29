package com.springcore.ci;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, String b) {
		this.a = a;
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : int , String");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double , double");
	}

	/*
	 * public Addition(String a, String b) { this.a = Integer.parseInt(a); this.b =
	 * Integer.parseInt(b); System.out.println("Constructor : String , String"); }
	 */

	public void doSum() {
		System.out.println("A is:" + a);
		System.out.println("B is:" + b);
		System.out.println("Sum is :" + (this.a + this.b));
	}

}
