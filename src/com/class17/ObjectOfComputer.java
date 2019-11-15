package com.class17;

public class ObjectOfComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer1=new Computer();
		computer1.brand="Apple";
		computer1.name="MacBook Pro";
		computer1.keyboard=true;
		computer1.screen=15;
		computer1.memory=250;
		System.out.println("I do NOT have "+ computer1.brand+ " "+computer1.name+" "+computer1.screen+" inch");
	}

}
