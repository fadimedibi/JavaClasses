package com.class31;


	public class StudentB extends A {
		int sub1;
		int sub2;
		int sub3;
		int sub4;
		
		public StudentB(int sub1,int sub2,int sub3, int sub4){
			super(sub1,sub2,sub3);
			this.sub4=sub4;
		}

	
		public double getPercentage() {
			 average=(sub1+sub2+sub3+sub4)/4;
			return average;
		}

	}

