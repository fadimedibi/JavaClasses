package com.class32;

import java.util.ArrayList;

public class Task {
//generic arrayList
	public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<>();
	
	arrayList.add("Fena");
	arrayList.add("Halde");
	arrayList.add("Yoruldum");
	arrayList.add("Ne");
	arrayList.add("Yapsam");
	
	System.out.println(arrayList.isEmpty());
	
	System.out.println(arrayList.contains("Nee"));
	
	System.out.println(arrayList.size());
	//printing all of them in one line
	System.out.println(arrayList);
	//one by one printing
for(String names:arrayList) {
	System.out.println(names);
}
	
//non generic 
	ArrayList alist=new ArrayList();
alist.add("Hello");
alist.add(100);
alist.add(10.10);
alist.add(true);
alist.add('c');

System.out.println(alist);


ArrayList<Object> blist=new ArrayList<>(); //generic
blist.add("Hello World");
blist.add(1007);
blist.add(10.20);
blist.add(false);
blist.add('d');

System.out.println(blist);
	}

}
