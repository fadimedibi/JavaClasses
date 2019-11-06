package com.class4;

public class NestedIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean isFriday=true;
		int day=131;
		//if today is friday only then I wanted to check if it day is 13
		
		//We have to check if it is Friday first, rest is not important
		
		if(isFriday) {
			System.out.println("Today is Friday");
			if (day==13) {
				
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch comedy");
			}
		
			
		}else {
			System.out.println("Today is NOT Friday");
		}
	}

}
