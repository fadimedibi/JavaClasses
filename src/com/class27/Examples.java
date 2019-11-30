package com.class27;

public class Examples {

	public String helloName(String str) { // overridden method
		return str;
		
	}
	public String helloName(String str,String str2) {
		return str+str2;
	}
	}

class smallExample extends Examples{
	
	public String helloName(String str) { // overriding method
		return "Hello "+str;
	}
}
