package com.class25;

public class Test {

	public static void main(String[] args) {
	System.out.println("--------Creating an object of an Employee Class");
	Employee emp=new Employee();
	emp.salary=70000;
	Employee.companyName="Syntax";
	emp.work();
	emp.getPaid();
	
	System.out.println("-------Creating an object of an ScrumTeam Class---------");
	ScrumTeam sm=new ScrumTeam();
	sm.salary=90000;
	sm.work();
	sm.getPaid();
	sm.artifacts="Product Backlog,Sprint Backlogs, Burndown Chart ";
	sm.ceremonies="Sprint Demo, Planning, Retro, Daily Stand Up ";
	sm.attendScrumMeetings();
	
	System.out.println("------Creating an object of an ScrumTeam Class------");
	Developer dev=new Developer();
	dev.salary=130000;
	dev.work();
	dev.code();
	dev.artifacts="Sprint Backlog";
	dev.ceremonies="Sprint Demo, Planning, Retro, Daily Stand Up";
	dev.attendScrumMeetings();
	
	}

}
