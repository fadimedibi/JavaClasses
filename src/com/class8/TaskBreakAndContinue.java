package com.class8;

public class TaskBreakAndContinue {

	public static void main(String[] args) {
// Print numbers from 1 to 50  
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
