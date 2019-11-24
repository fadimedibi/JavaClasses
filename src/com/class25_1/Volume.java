package com.class25_1;

public class Volume {
	

public static void area(int num1) {
	System.out.println("area of a square with side of "+ num1+" is= "+num1*num1);
}

public static void area(int num1, int num2) {

	System.out.println("area of a rectangle with sides of "+ num1+ " , "+num2+ " is= "+num1*num2);	
}
public static void area(int num1, int num2, int num3)	{
	
	System.out.println("volume of a box with sides of "+ num1+ " , "+num2+" , "+num3+ " is= "+ num1*num2*num3);	
}	
public static void main(String[] args) {
	Volume obj=new Volume();
	obj.area(5);
	obj.area(6, 7);
	obj.area(2,5,10);
	

	
	}
}

