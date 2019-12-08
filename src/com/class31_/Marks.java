spackage com.class31_;

public abstract class Marks {
	// We have to calculate the percentage of marks obtained in three subjects (each
	// out of 100) by student A and in four subjects (each out of 100) by student B.
	// Create class ‘Marks’ with an abstract method ‘getPercentage’.
	// It is inherited by classes ‘A’ and ‘B’ each having a method with the same
	// name which returns the percentage of the students.
	// The constructor of student A takes the marks in three subjects as its
	// parameters and the marks in four subjects as its parameters for student B.
	// Test your code

	abstract void getPercentage();

}

class A extends Marks {

	int sub1;
	int sub2;
	int sub3;

	A(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	@Override
	void getPercentage() {
		double average = (sub1 + sub2 + sub3) / 3;
		System.out.println(average);

	}

}

class B extends A {
	int sub4;

	B(int sub1, int sub2, int sub3, int sub4) {
		super(sub1, sub2, sub3);
		this.sub4 = sub4;

	}

	void getPercentage() {
		double average = (sub1 + sub2 + sub3 + sub4) / 4;
		System.out.println(average);

	}

}