package com.class20;

public class USA {

	private String capitalCity="Washington DC";
	public String mainState="New York";
	protected String school="Syntax";
	
	public static void main(String[] args) {
		USA us=new USA();
		System.out.println("Access from inside USA class even they are private ");
		System.out.println(us.mainState);
		System.out.println(us.school);
		System.out.println(us.capitalCity);
	}
	
	
	
	
	
	
	
	
	
}
