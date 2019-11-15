package com.class17;

public class Phone {
String name, model;
boolean frontCamera;
int memory;

void video(){
	System.out.println("I can take video with my "+name+" "+" "+model);
}
void call() {
	System.out.println("I can call with my "+name+" "+" "+model);
}
void message() {
	System.out.println("I can send messages with my "+name+" "+" "+model);
}
public static void main(String[] args) {
	Phone p1=new Phone();
	p1.name="iPhone";
	p1.model="X";
	p1.frontCamera=true;
	p1.memory=64;
	
	System.out.println("I have a "+ p1.name+ " "+ p1.model );
	p1.video();
	p1.call();
	p1.message();
}
}
