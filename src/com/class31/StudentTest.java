package com.class31;

public class StudentTest {
	
		public static void main(String[] args) {
			StudentB b=new StudentB(90, 98, 78, 50);
			double average=b.getPercentage();
			System.out.println(average);
			
			StudentA a=new StudentA(90, 80, 70);
			average=a.getPercentage();
			System.out.println(average);
		}
	}

