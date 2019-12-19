package com.class36;

import java.util.*;

public class TaskIntegers {

	public static void main(String[] args) {
		// Create a collection of integers in which you can keep duplicates. 
		// Write a logic to find sum of all integers

		List<Integer> list=new LinkedList<>();
		list.add(123);
		list.add(223);
		list.add(323);
		list.add(423);
		list.add(523);
		list.add(223);
		list.add(423);
		
		int sum=0;
		for (Integer l : list) {
			sum+=l;
		}
		System.out.println(sum);
	}

}
