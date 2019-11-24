package com.class21;

public class Forest {

	private static int numberOfFoxes;
	private String color;
	private int speed;

	public static void main(String[] args) {
		// //Create four classes: Forest, Wolf, Fox, Bear
	    //Class wolf has: color, age, numberOfWolves
	    //Class fox has: color, speed, numberOfFoxes
	    //Class bear has: type, weight, numberOfBears
	    
	    //Forest has main method
	    //Create different objects/instances of different classes
	    //At the end, print the total for each animal

		Wolf w1=new Wolf();
		Wolf w2=new Wolf();
		Wolf w3=new Wolf();
		
		w1.color="black";
		w1.age=7;
		Wolf.numberOfWolves++;
		
		w2.color="gray";
		w2.age=3;
		Wolf.numberOfWolves++;
		
		w3.color="white";
		w3.age=4;
		Wolf.numberOfWolves++;
		
		
		Fox f1=new Fox();
		Fox f2=new Fox();
		Fox f3=new Fox();
		Fox f4=new Fox();
		
		f1.color="brown";
		f1.speed=50;
		Fox.numberOfFoxes++;
		
		f2.color="orange";
		f2.speed=60;
		Fox.numberOfFoxes++;
		
		f3.color="rainbow";
		f3.speed=63;
		Fox.numberOfFoxes++;
		
		f4.color="pink";
		f4.speed=45;
		Fox.numberOfFoxes++;
		
		Bear b1=new Bear();
		Bear b2=new Bear();
		Bear b3=new Bear();
		
		b1.type="Grizzles";
		b1.weight=200;
		Bear.numberOfBears++;
		
		b2.type="Brown";
		b2.weight=250;
		Bear.numberOfBears++;
		
		b3.type="Yogi";
		b3.weight=275;
		Bear.numberOfBears++;
		
		System.out.println("Total number of wolves: "+Wolf.numberOfWolves);
		System.out.println("Total number of foxes: "+Fox.numberOfFoxes);
		System.out.println("Total number of bears: "+Bear.numberOfBears);
		
	}

}
