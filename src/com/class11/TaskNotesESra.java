package com.class11;

public class TaskNotesESra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a 2D array of integer type with 3 rows and 4 columns and 
         * print all values of the whole array.
         */
        
        int [][] a = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
        
    
        for(int i = 0; i<a.length;i++) {
            for (int j=0; j< a[i].length;j++) {
                
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------------");
        
/*
 * 1-Create a 2D array or integer type where you will store odd and 
 * even numbers in 3 rows and 4 columns.
  Develop a program which will identify/print the even numbers only.
 */
        
        int [][] b = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
        
        for(int []i:b) {
            for(int j:i) {
                if(j%2==0) {
                    System.out.print(j);
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
        System.out.println("-----------------------");
        
    /*
     * 2-Create a 2D array or integer type and store numbers in 3 rows 
     * and 3 columns.
       Print the sum of all numbers.    
     */
        
        
        int [][] c = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        
        for(int[] i:c) {
            for(int j:i) {
                sum = sum+j;
            }
        }
        System.out.println("The sum of all numbers in array is " + sum);

	}

}
