package com.class31_;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration obj=new Registration();
		obj.setEmail("gmail");
		obj.setUserName("YoruldumArtik");
		obj.setPassword("HayatZor!!");
		
		System.out.println("Email Address: "+obj.getUserName()+"@"+obj.getEmail()+".com"+'\n'+
				 "Password: "+obj.getPassword());
		
	}

}
