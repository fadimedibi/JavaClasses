package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		// you cannot create an object of an abstract class
		// Phone phone = new Phone(); CE can not instantiate
		 // we can create it indirectly
		
		Phone phone = new iPhone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();
		
		
		Phone phone1 = new Samsung();
		phone1.makeCall();
		phone1.sendText();
		phone1.takePictures();
		phone1.playGames();
	}

}
