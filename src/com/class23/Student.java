package com.class23;

public class Student {
	//Write a java program of Class Students that takes students name and 3 subject grades. 
	//Inside your class also have a method to Calculate Average Grade.
	//Test Student class for 5 different students with different marks.
	//Your program should print an average mark of each students name.
	
	String nameOfSt;
	int grade1;
	int grade2;
	int grade3;
		
	Student(String name, int gr1, int gr2, int gr3) {
		nameOfSt=name;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
		
		int ave=(gr1+gr2+gr3)/3;
		System.out.println("Student "+name+ " and Average of his/her grades is: "+ave);
		if(ave>=85) {
			System.out.println("You did a great job!");
			}
			else if(ave>=70 && ave<85) {
				System.out.println("Good Job");
			}else {
				System.out.println("You need to study more!");
			}
		}
	public static void main(String[] args) {
		Student st1=new Student("Zeynep",99,100,80);
		Student st2=new Student("Ferhat", 87,49,100);
		Student st3=new  Student("Sumeyye",80,56,103);
		Student st4=new Student("Murat", 76,90,68);
		Student st5=new Student("Fadime", 100, 45,64);
	}
	
	
}
