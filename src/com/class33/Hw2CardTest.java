package com.class33;

import java.util.Iterator;
import java.util.LinkedList;

public class Hw2CardTest {

	public static void main(String[] args) {

LinkedList<Card> cards=new LinkedList();

MasterCard mc=new MasterCard("Master Card");
CreditCard cc=new CreditCard("Credit Card");
DebitCard dc=new DebitCard("Debit Card");

cards.add(mc);
cards.add(cc);
cards.add(dc);

System.out.println("------1st way for loop-------");
 for(int i=0; i<cards.size();i++) {
	 cards.get(i).openAnAccount();
	 cards.get(i).moneyOrderFee(4500.0);
 }
 
 System.out.println("------2nd way for each loop-------");
 for(Card c:cards) {
	 c.openAnAccount();
	 c.moneyOrderFee(1950);
 }
 System.out.println("------3rd way iterator-------");
 
 Iterator<Card> it=cards.iterator();
 while(it.hasNext()) {
	 Card i=it.next();
	 i.openAnAccount();
	 i.moneyOrderFee(225);
	 }
	}

}
