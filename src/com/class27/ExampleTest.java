package com.class27;

public class ExampleTest {

	public static void main(String[] args) {
	Examples ex=new smallExample();
	String str=ex.helloName("John","Allie");
	System.out.println(str);
	System.out.println(ex.helloName("Jane"));
	
	Examples example=new Examples();
	System.out.println(example.helloName("Jack"));
	
	
	}

}
