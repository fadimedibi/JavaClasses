package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();//used to call current class constructor
		System.out.println("I am constructor with 1 string parameter");
	}
	
	ThisWithConstructor(String str, String str2){
		this(str);
		System.out.println("I am constructor with 2 string parameter");
	}
	
	
	ThisWithConstructor(String str, String str2, int a){
		this("Hello", "Merhaba");
		System.out.println("I am constructor with 3 string parameter");
	}
	
	
	
	
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		//Can we execute 2 constructors when creating an object
		//YES - it can be achieved using this()
		//this type of constructor calls is known as CONSTRUCTOR CHAINING
		System.out.println("----------------"); 
		
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","Bye");
		
		System.out.println("----------------");
		
		ThisWithConstructor obj2=new ThisWithConstructor("Hello", "What",8);
	}
}
