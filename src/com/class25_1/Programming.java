package com.class25_1;

public class Programming {
public void method(){
	System.out.println("I love proggraming languages");
}
public void method(String str){
	System.out.println("I love "+str);
}
public static void main(String[] args) {
	Programming p=new Programming();
	p.method();
	p.method("Java");
}
}
