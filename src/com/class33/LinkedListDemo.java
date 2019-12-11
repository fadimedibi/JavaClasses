package com.class33;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// create a linked list of string object

		LinkedList<String> llist = new LinkedList<>();

		llist.add("hello");
		llist.add("Bye");

		System.out.println(llist.size());
		llist.add("hello1");
		llist.add("Bye1");

		// retrieve
		System.out.println(llist.get(1));
		// update/replace
		llist.set(2, "Hi");
		System.out.println(llist);

		// how to retrieve all values from linked list

		System.out.println("-----1st way  for loop---------");
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("-----2nd way  for each/advanced loop---------");
		for (String element : llist) {
			System.out.println(element);
		}
		System.out.println("-----3rd way  iterator---------");

		Iterator<String> it = llist.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

}
