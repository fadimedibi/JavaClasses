package com.class25_1;

public class Overload {
	
	//Create 1 class with a static method that has 3 overloaded forms.
	//Then call each overloaded method with specific arguments and observe result.
	
	
public static void method(int year) {
	System.out.println("This Year "+ year);
}
public static void method(String month, int year) {
	System.out.println("This Month: "+month+" This Year: "+ year);
}
public static void method(int day,String month, int year) {
	System.out.println("Today is Teacher's day: "+ day+" " +month+" "+ year);
}
public static void main(String[] args) {
	Overload obj=new Overload();
	obj.method(2019);
	obj.method("November", 2019);
	obj.method(24,"November", 2019);
}
}
