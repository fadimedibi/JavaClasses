package com.class10;

public class TaskArrays {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F.
		//Then print a grade B (use 2 different ways of creating an array).
		
		char []grades= {'A', 'B', 'C', 'D', 'E','F'};
		System.out.println(grades[1]);
		
		char []grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		//Create an array of names and store all names of your group.
		//Then print your name from that array. (use 2 different ways of creating an array).
		String[]names=new String[7];
		names[0]="Fadime";
		names[1]="Keniul";
		names[2]="Manana";
		names[3]="Ayna";
		names[4]="Omer";
		names[5]="Murat";
		names[6]="CHN";
		System.out.println(names[0]);
		
		String[] name= {"Fadime", "Keniul", "Manana", "Ayna", "Omer", "Murat", "CHN"};
				System.out.println(name[0]);
				
		//Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 		
			String[]words= {"Java ", "Saturday ","Day", "coding ", "is "};
			System.out.println(words[1]+words[4]+words[0]+words[3]+words[2]);
	}

}
