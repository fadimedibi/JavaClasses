package com.class36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//Create a Person class with following private fields: name, lastName, age,
	// salary.
	// Variables should be initialized through constructor.
	// Inside the class also create a method to print user details.
	// In Test Class create a Map that will store key in ascending order. In that
	// map store personId and a Person Object. Print each object details
class Person {
	private String name, lastName;
	private int age, salary;

	Person(String name, String lastName, int age, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;

	}

	public void userDetails() {
		System.out.println(name + " " + lastName + " : " + age + " = " + salary);
	}

}

public class TaskPerson {
	
	public static void main(String[] args) {
		Map<Integer, Person> personMap = new TreeMap<>();
		personMap.put(1, new Person("Turkan", "Soray", 39, 200000));
		personMap.put(2, new Person("Sener", "Sen", 39, 150000));
		personMap.put(3, new Person("Ali", "Sunal", 39, 175000));
		personMap.put(4, new Person("Kemal", "Sunal", 39, 190000));

		Set<Entry<Integer, Person>> personSet = personMap.entrySet();
		for (Entry<Integer, Person> per : personSet) {
			System.out.print(per.getKey() + " ");
			per.getValue().userDetails();
		}

	}

}
