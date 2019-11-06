package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("How much loan you need?");
		
		int loan=input.nextInt();
	if (loan>200000) {
		System.out.println("We can lend the money");
		
		
	}else {
		System.out.println("We are sorry, but we can not!");
	}

	}

}
