package com.class6;

public class SwitchCaseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=3;
		switch (day) {
		case 1: // day==1
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "Invalid";

		}

	}

}
