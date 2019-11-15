package com.class19;

public class Recap1 {
void sum(int num1, int num2){
	int c=num1+num2;
	System.out.println("The sum of 2 number is = "+c);
}
// create method to display hello 5 times

void sayHello(int times) {
	for (int i = 0; i < times; i++) {
		System.out.println("Hello");
		}
}

// create method to say something # number of times
void saySomething(String word,int times) {
	for(int i=0; i<times; i++) {
		System.out.println(word);
	}
}

public static void main(String[] args) {
	Recap1 obj=new Recap1();
	obj.sum(10, 20);
	System.out.println("---------------");
	obj.sayHello(10);
	obj.saySomething("Java",8);
//	obj.saySomething(5, Welcome); compiler error. order of the parameter must be match
				
	
}




}
