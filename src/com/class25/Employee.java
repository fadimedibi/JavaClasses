package com.class25;

public class Employee {
	
public static String companyName;	
int salary;
protected int employeeId;
private int employeeSsn;


void work() {
	System.out.println("I work in "+companyName+" company");
}

void getPaid() {
	System.out.println("I get paid "+salary);
}
}
