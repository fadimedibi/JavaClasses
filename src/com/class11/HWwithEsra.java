package com.class11;

public class HWwithEsra {

	public static void main(String[] args) {
		// Create a 2D array where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 String [][] name = {{"Mrs", "Mr", "Ms", "Miss"},{"Smith", "Obama", "Jackson", "Jordan"}};
	        
	        // 00 10 /01 11/ 02 12 /03 13
	        
	        for(int i=0;i<4;i++) {
	            for(int j=0;j<2;j++) {
	                System.out.print(name[j][i]+" ");
	            }
	            System.out.println();
	        }
	        System.out.println("*****************");
	       //2nd way
	        System.out.println(name[0][0]+" "+name[1][0]);
	        System.out.println(name[0][1]+" "+name[1][1]);
	        System.out.println(name[0][2]+" "+name[1][3]);
	        System.out.println(name[0][3]+" "+name[1][3]);
	        
	       System.out.println("*********************");
	       
	       String[][] names= {
	       {"Mrs", "Mr","Ms","Miss"},
	       {"Smith", "Obama", "Jackson", "Jordan"}
	       };
	       for(int i=0; i<4; i++) {
	    	   for(int j=0; j<2;j++) {
	    		   System.out.print(names[j][i]+" ");
	    	   }
	       }
	    }
	}

