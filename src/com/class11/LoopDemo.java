package com.class11;

public class LoopDemo {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=4; j++) {
			System.out.println("i= "+i+" J= "+j);
			}
			System.out.println();
		}
		
		System.out.println("*********************");
	     String[][] msrAdd={ {"Mr","Mrs","Ms","Miss"},{"Smith","Jordan","Jackson","Obama"}};
	        int k=0;
	        for (int i=0; i<4; i++) {
	            for(int j=0; j<4; j++) {
	                
	                System.out.println(msrAdd[i][j] + " "+ msrAdd[i+1][j]);
	                
	            }}
		
		
	}
	}
