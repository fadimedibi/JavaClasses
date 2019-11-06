package com.class11;

public class HomeworkNamesGrades {

	public static void main(String[] args) {
// Create a 2D array that first row will contain 4 names and second row will contain grades.
//	Then you program should print name of the students that has as an A and B grade
		String[][] namegr = { { "John", "Will", "Kate", "Ela" }, { "A", "B", "C", "D", "F" } };
		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(namegr[j][i]+" ");
			}
			System.out.println();
				
				
				
//				if (namegr[i].equals("A")){
//	                   System.out.println(namegr[i][j]+ " has grade of A");
//	               }else if((namegr[i].equals("B"))){
//	            	   System.out.println(namegr[i][j]+ " has grade of B");
//	               }else {
	            	   
	               
	              
		
			}
		
		  String [][] nameGrade= {{"ZEYNEP","HASAN","OZLEM","HILAL"},{"C","A","A","B"}};    
	        for (int i=0; i<nameGrade.length; i++) {
	            
	            for (int j=0; j<nameGrade[i].length; j++){
	                
	                System.out.println(nameGrade[i][j]+ " has an "+nameGrade[i+1][j] +" grade.");
	                
	                
	            }
	            System.out.println();
	        }
		}

	}

