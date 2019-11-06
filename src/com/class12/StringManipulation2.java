package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {

		/*
		 * .contains();
		 * 
		 */
		String sentence = "It was raining";
		String sen = "raining";
		System.out.println(sentence.contains(sen));

		System.out.println(sentence.contains("was"));

		// create two strings and initialize them with some value.
		// implement the following methods on those strings.
//		sen.length();
//		sen.equals();
//		sen.contains();
//		sen.toUpperCase();
//		sen.toLowerCase();
//		sen.equalsIgnoreCase(anotherString);

		String str1 = "Banana";
		String str2 = "Abana";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.contains("ana"));
		System.out.println(str2.contains("ana"));
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());
		// .startsWith();
		String str3 = "It is very hot in the class";
		System.out.println("Is this string starts with= " + str3.startsWith("It"));
		// System.out.println("Is this string starts with= "+str3.startsWith(String
		// prefix, index));
		System.out.println("Is this string starts with= " + str3.startsWith("very", 6));

		// .endsWith()
		System.out.println("Is this string ends with= " + str3.endsWith("class"));
		// .isEmpty()
		System.out.println("Is this string empty= " + str3.isEmpty());

		String str4 = "";
		System.out.println("Is this string empty= " + str4.isEmpty());
		if (!str4.isEmpty()) {
			System.out.println("This is not empty");
		} else {
			System.out.println("this is empty");
		}
		// \n
		String sentence1="Each day has a promise to brighten up the day,\nBut first you must allow.......";
		System.out.println(sentence1);
		
		//.concat(String)
		
		String str5= "Hello";
		String str6= " World";
		String str7=" people";
		System.out.println(str5+str6);
		System.out.println(str5.concat(str6));
		System.out.println(str5.concat(str6).concat(str7));
		
		//.trim(); bosluklari kesiyor bastan ve sondan. 
		//Returns a string whose value is this string, 
		//with any leading and trailing whitespace removed.
		
		String str8=" How are you ?";
		System.out.println(str8.trim());
		
		//.charAt(index)
	String str9="We might be done early today";
	System.out.println(str9.charAt(6));
	
		
	System.out.println(str9.indexOf('m'));	
	System.out.println(str9.indexOf('e', 19));
	
	}
}
