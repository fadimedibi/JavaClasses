package com.class10;

public class Array {

	public static void main(String[] args) {
		int a;
		a=10; 
		
		int a1=10; 
		//1 way
		int[] b;   //declare an array---->preferred way
		int c[];
		
		b=new int[4];     //----->initilization
		
		// 2nd way
		int[] array=new int[4];  // declaring and initilaziton
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access value from an array
		System.out.println(array[2]);
	// array of strings
		String[] classes=new String[4];
		
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manuel Testing";
		classes[3]="GIT";
		System.out.println("Today we have "+ classes[0]+ " class");
		
		int[]nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1 to 100
		nums[0]=100;
		
		System.out.println(nums[0]+nums[2]);//100+3
		
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		//names[3]="Olga";	//java.lang.ArrayIndexOutOfBoundsException(while executing this 
		// error will show. we do not have index 4 which is names[3].
		
		// System.out.println(names[3]);
		System.out.println(names.length);
		
		
		// if we put less element inside , compiler will give default values
		
		
		int []numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
	
		System.out.println(numbers[0]);
		
		double[] number=new double[4];
		number[1]=100;
		number[3]=200;
	
		System.out.println(numbers[2]);
			
	}

}
