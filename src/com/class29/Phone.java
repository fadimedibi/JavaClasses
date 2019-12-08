package com.class29;

public abstract class Phone {

	public void makeCall() { // implemented method
		System.out.println("Make call");
	}

	public void sendText() { // implemented method
		System.out.println("Send text");
	}

	// unimplemented methods
	public abstract void takePictures();

	public abstract void playGames();

}

class iPhone extends Phone {
	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iphone");
	}

}

class Samsung extends Phone {

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");

	}

	@Override
	public void playGames() {
		System.out.println("Play games on Samsung");

	}

}
