package com.class24;


public class Test1 {

	public static void main(String[] args) {
		System.out.println("This is ClassA / hospital employee");
		ClassA a1 = new ClassA();
		System.out.println(a1.position);
		System.out.println(a1.workHours);
		a1.info();
		System.out.println("This is ClassB / Doctor");
		ClassB b1 = new ClassB();
		System.out.println(b1.position);
		System.out.println(b1.workHours);
		b1.info();
		b1.treat();
		System.out.println("This is ClassC / Surgeon");
		ClassC c1 = new ClassC();
		System.out.println(c1.position);
		System.out.println(c1.workHours);
		c1.info();
		c1.treat();
		c1.operation();
	}
}
