package com.class38LastClass;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 13;

		division(12, 0);
		division(12, 2);

	}

	public static void division(int num1, int num2) {

		int result;
		try {
			result = num1 / num2;//Arithmetic Exception
			System.out.println(result);
			Thread.sleep(5000);// new interrupted exception
//		}catch(Exception e) {   // CE: unreachable code (Exception e) is so general, specific codes can not be at the bottom
//			System.out.println("Catching all types of exception");
//		}
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Please do not pass 0 as a second number");
		}catch(InterruptedException e) {
			System.out.println(e);
			System.out.println("Someone interrupted program sleep");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Catching all types of exception");
		}
		System.out.println("end of method");
	}
	

}
