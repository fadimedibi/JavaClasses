package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		String str="your Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("*****************************");
		
		System.out.println(str.replace("your", "My"));
		
		System.out.println("*****************************");
	
String str2="The state of an OBJECT is stored in fields (variables),"
		+ " while METHODS (functions) display the object's behavior.";	
	System.out.println(str2.replaceAll("in(.*)", ""));
	
	String str3="12&^^%$#$%^345hel98776lo$%#^@%&**(^";
	System.out.println(str3.replaceAll("[0-9]",""));
	System.out.println(str3.replaceAll("[^0-9]",""));
	System.out.println(str3.replaceAll("[a-zA-Z]",""));
	System.out.println(str3.replaceAll("[^a-zA-Z^]",""));
	
	System.out.println("*****************************");
	
	System.out.println(str2.replaceFirst(" ",""));
	
	
	}

}
