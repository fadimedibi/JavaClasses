package com.class31;


	public class StudentA extends Marks {
		int sub1;
		int sub2;
		int sub3;
		
		public StudentA(int sub1,int sub2,int sub3){
		super(sub1,sub2,sub3);
	}
		
		@Override
	public	double getPercentage() {
			double average=(sub1+sub2+sub3)/3;
			return average;
		}

	}
