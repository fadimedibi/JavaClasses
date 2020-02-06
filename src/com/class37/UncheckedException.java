package com.class37;

public class UncheckedException {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		
		try {
			System.out.println("I am inside the try block");
		System.out.println(a / b);
		System.out.println(" I continue inside the try block");
		}catch(ArithmeticException e) { //ArithmeticException e=new ArithmeticException();
			System.out.println("I am in catch block");
			e.printStackTrace();
			System.out.println(e);
			//System.out.println(e.getMessage());
			
		}
		
		
		
		
		System.out.println("End of code");
	}

}
