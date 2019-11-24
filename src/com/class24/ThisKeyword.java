package com.class24;

public class ThisKeyword {
	
	int a,b;
	
	public ThisKeyword(int a, int b) {
		
		this.a=a;
		this.b=b;
	}
	
	public  void sum(int a, int b) {
		System.out.println("The sum of local parameters is: "+(a+b));
		System.out.println("The sum of instance parameters is: "+(this.a+this.b));
	}
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA(); // you can also say sayA();
		sayB();		// you can also say this.sayB(); compiler will add this automatically
	}
	

	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(5,10);
		obj.sum(10, 20);
		obj.sayAandB();
		obj.sayA();
		obj.sayB();
		
		
		
		System.out.println("-------------");
		
		ThisKeyword obj1=new ThisKeyword(20,20);
		obj1.sum(100, 200);
	}
}
