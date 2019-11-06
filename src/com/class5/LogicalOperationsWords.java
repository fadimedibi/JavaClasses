package com.class5;

public class LogicalOperationsWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7 days a week
//			if days is tuesday or Thursday---->SDLC class
//			if day Saturday or Sunday---->java class
//			idf day Monday or friday----- no class
//			if day wednesday----->review classs
		
		String weekDay="Monday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
		}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
			
		}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review Day");
		}else {
			System.out.println("Not a valid day");
		}
			
		
		
		

	}

}
