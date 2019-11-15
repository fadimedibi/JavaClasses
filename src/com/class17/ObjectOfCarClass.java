package com.class17;

public class ObjectOfCarClass {
public static void main(String[] args) {
	//to create an object syntax is
	//className variable =new ClassName();
	//Scanner scan=new Scanner(System.in);
	//String str=new String();
	
	Car car1=new Car();
	car1.make="Tesla";
	car1.model="S3";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	car1.drive();
	car1.start();
	car1.accelerate();
	
	
	System.out.println("--------2nd variable car2----------");
	
	
	Car car2=new Car();
	car2.make="BMW";
	car2.model="i8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=6;
	car2.speed=300;
	car2.make="Toyota";
	
	car2.drive();
	car2.start();
	car2.accelerate();
	
	//lets print features of the car
	//I have black Tesla
	System.out.println("I have "+car1.color+" "+car1.make);
	
	System.out.println("I have "+car2.year+" "+car2.make+" "+car2.model);
}
}
