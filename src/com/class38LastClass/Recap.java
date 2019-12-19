package com.class38LastClass;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		
		int num=1;
	//	int num1="1";
		
		
		//runtime exception-unchecked exception
		int[] nums= {12,13};
		
		try {
		System.out.println(nums[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Tyring to access element outside of the boundry");
		}
		//compile time exception-checked exception
		Thread.sleep(10000);
		System.out.println("End of code");
		
		
	}

}
