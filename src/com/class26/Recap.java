package com.class26;

public class Recap {
	public void hello()	{
		
	}
	public void hello(String str) {
		System.out.println("Hello "+str);
	}
	
/*	private void hello(String str) {
		System.out.println("Hello"+str);------> not overloading
	}
	public String hello(String str); ---------> not overloading
	return str;
	*/
	
	public static void main(String[] args) {
		Recap obj=new Recap();
		obj.hello();
		obj.hello("It is me");
		}
	
}
