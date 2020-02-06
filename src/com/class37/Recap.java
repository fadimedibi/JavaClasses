package com.class37;

public class Recap {

	public static void main(String[] args) {

		try {
			int num = Integer.parseInt("akki");
		} catch (NumberFormatException e) {
			 NumberFormatException a=new NumberFormatException();

			System.out.println(e.getMessage());
			
			//throw (a);
		}

	}

}
