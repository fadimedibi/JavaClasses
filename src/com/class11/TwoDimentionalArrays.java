package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Declare 2D array
		int[][] array=new int[3][4];
// create 1st row;		
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
// create 2nd row;
		
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
// 3rd row:
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=6;
		
		System.out.println(array[1][3]);
		
	//task: create 2D arrays of String with 3 rows and 3 columns
		
		String[][] list=new String[3][3];
		list[0][0]="Allie";
		list[0][1]="Mary";
		list[0][2]="John";
		
		list[1][0]="Zeynep";
		list[1][1]="Ferhat";
		list[1][2]="Sumeyye";
		
		list[2][0]="Ali";
		list[2][1]="Ayse";
		list[2][2]="Ahmet";
		
		System.out.println(list[2][1]);
		
		System.out.println("********************");
		int[][] numbers= {
				{8,7,55,3,8},
				{10,12,33,4,9},
				{3,6,8,0,7}
		};
		
		System.out.println(numbers[2][4]);
		
		//if you want to get the length of array(number of the rows:
		System.out.println(numbers.length);
		System.out.println("number of the rows: "+ numbers.length);
		//if you want to get the length of the 1st row:
		System.out.println(numbers[0].length);
		System.out.println("number of the elements in 1st row: "+ numbers[1].length);
		System.out.println("----------------");
for(int i=0; i<numbers.length; i++) {
	for(int j=0; j<numbers[i].length; j++) {
		System.out.print(numbers[i][j]+" ");
	}
	System.out.println();
}	
System.out.println("*************************");

for(int[] i: numbers) 
{
    for(int j: i) 
    {
        System.out.print(j + " ");
        
    }
    System.out.println();
}	
	}

}
