package com.class2;

public class AritmeticOperations {
	/*
	 * declare 2 variables and initialize them
	 * perform addition, subtraction, multiplication and division
	 * 
	 */
	public static void main(String[]args) {
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		
		System.out.println(num1+" "+num2);
		
		int sum=num1+num2;
	
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//the addition of two numbers is _
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("the addition of two numbers is "+ sum);
		
		System.out.println("the subtraction of two numbers is "+ sub);
		System.out.println("the multiplication of two numbers is "+ mult);
		System.out.println("the division of two numbers is "+ div);
		
		double number1, number2;
		
		number1=20.5;
		number2=3.1;
		
		double sum2=number1+number2;
		double sub2=number1-number2;
		double mult2=number1*number2;
		double div2=number1/number2;
		
		
		System.out.println("The addition of 2 numbers number1 and number2 is equal to "+ sum2);
		System.out.println("The subtraction of 2 numbers number1 and number2 is equal to "+sub2);
		System.out.println("The multiplication of 2 numbers number1 and number2 is equal to "+ mult2);
		System.out.println("The division of 2 numbers number1 and number2 is equal to "+ div2);
		
		
		double nu1=3.9;
	
		double mult3=nu1*nu1;
		System.out.println("The square of the " + nu1+ " is "+ mult3);
		
		int w=5;
		int h=8;
		
		int per=(w+h+w+h);
		int area=w*h;
					
		System.out.println("the perimeter of a rectangle with width "+ w + " and height " +h + " is equal to "+per +" and the  area is " +area );
		
		
		String message="the perimeter of a rectangle with width "+ w + " and height " +h + " is equal to "+per +" and the  area is " +area;
		
		
		System.out.println(message);
		
						
		
		
	}

}
