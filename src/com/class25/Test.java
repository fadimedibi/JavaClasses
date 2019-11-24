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
	dev.getPaid();
	dev.work();
	dev.code();
	dev.artifacts="Sprint Backlog";
	dev.ceremonies="Sprint Demo, Planning, Retro, Daily Stand Up";
	dev.attendScrumMeetings();
	dev.fixBugs();
	dev.employeeId=101;
	//dev.employeeSsn  not accessible
	
	System.out.println("------Creating an object of an Tester Class-----");
	Tester test=new Tester();
	test.salary=110000;
	test.getPaid();
	test.work();
	test.artifacts="Sprint Backlog";
	test.ceremonies="Sprint Demo, Planning, Retro, Daily Stand Up";
	test.attendScrumMeetings();
	test.findBugs();
	
	System.out.println("------Creating an object of an ProductOwner Class-----");
	ProductOwner po=new ProductOwner();
	po.salary=110000;
	po.getPaid();
	po.work();
	po.artifacts="Sprint Backlog";
	po.ceremonies="Sprint Demo, Planning, Retro, Daily Stand Up";
	po.attendScrumMeetings();
	po.prioritize();
	po.AcceptAndReject();
	
	}

}
