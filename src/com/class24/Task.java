package com.class24;

public class Task {
	
	String name;
	int num;
	
private Task(String name1) {
	name=name1;
}
public Task(String name1, int num1) {
	name=name1;
	num=num1;
}
protected Task(int num1) {
	num=num1;
}

//public static Task(String name1, int num1){ We can't use static for constructor!!!
//	name=name1;
// num=num1;
	
//	}
public void display() {
	System.out.println(name+ " "+num);
}
	public static void main(String[] args) {
		Task obj1=new Task("Fadime", 35);
		obj1.display();
		Task obj3=new Task(35);
		obj3.display();
	}


}
