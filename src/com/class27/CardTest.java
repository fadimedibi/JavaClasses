package com.class27;

public class CardTest {

	public static void main(String[] args) {
		//primitive
		int i=10;
		//non primitive
		String str= "Hello";
	//	Scanner scan;
		MC mc;
		
	//Take an object of the child class and give reference to the psrent
	//  reference variable   = 	object is created
	Card card=new AX();
	card.chargeInterest();
	card.creditLimit();
	
	Card card1=new MC();
	card1.creditLimit();
	
	Card card2=new Visa();
	card2.creditLimit();
	
	System.out.println("----with Arrays------");
	//type[] arrayNAme={};
	//type[] arrayName=new type[];
	
	int [] numArray= {10,12,13};
	String[] stringArray= {"aa","bb"};
	
	// 1st we created objects and assigned to the variables and then stored those variables inside the array
	Card[] cardArray= {card, card1,card2};
	
	//Creating an object and storing it directly into an Array of Cards
	Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
	
	//cardArray[0]----->MC
	//cardArray[3]-----> Discovery
	
	for(Card myCard:cardArray1) {
		myCard.creditLimit();
	}
	
	for (int j = 0; j < cardArray1.length; j++) {
		cardArray1[j].creditLimit();
	}
	System.out.println("Creating object of each class");
	Card c1=new Card();
	c1.chargeInterest();
	c1.creditLimit();
	
	AX ax1=new AX();
	ax1.chargeInterest();
	ax1.creditLimit();
	
	MC mc1=new MC();
	mc1.chargeInterest();
	mc1.creditLimit();
	mc1.cashBack();
	
	MC mc2=new MC();
	MC mc3=new MC();
	Card cc=new MC();
	cc.chargeInterest();
	cc.creditLimit();
	
	System.out.println("-----creating an array that will hold only Master Cards objects-----");
	
	MC[] masterCards= {mc1,mc2, mc3 };
	for(MC mCard:masterCards) {
		mCard.cashBack();
		mCard.chargeInterest();
		mCard.creditLimit();
	}
	
	
	
	
	
	
	
	}

}
