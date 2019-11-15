package com.class18;

public class RecapClassObject {

	int students, teachers, classRooms;
	String name,address,website;
	void study() {
		System.out.println("I am a message from study method");
		System.out.println("Students are studying at "+name);
		System.out.println("End of the study method");
	}
	void teach() {
		System.out.println("Teachers are teaching at "+name);
	}

	public static void main(String[] args) {
		RecapClassObject school=new RecapClassObject();
		school.name="Syntax";
		school.students=200;
		
		RecapClassObject school1=new RecapClassObject();
		school1.name="Pinnacle";
		school1.students=150;
		
		school1.teach();
		school.study();
		
		
	}
	}

