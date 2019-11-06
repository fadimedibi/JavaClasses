package com.class7;

public class TaskScenario {

	public static void main(String[] args) {
		// create a boolean variable workDay and assign true
		// create int variable day and assign it to 1
		// as long as it is workDay print "I need a day off"
		// once day is 6 print "I do not need a day off anymore"

//		  boolean workDay=true;
//		    int day=1;    
//		    while(day<=7) {
//		        System.out.println("i need a day off");
//		        if(day==6) {
//		            System.out.println("i do need a day off any more");
//		        }
//		        day++;
//		    }
		boolean workDay = true;
		int day = 1;
		while (workDay) {
			if (day == 6) {
				System.out.println("I do not need a day off anymore");
				workDay = false;
			} else {
				System.out.println("I need a day off");
			}
			day++;
		}
	}

}
