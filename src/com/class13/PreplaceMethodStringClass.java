package com.class13;

public class PreplaceMethodStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// .replace method
		String str="Hello Dear, How are you dear?";
		System.out.println(str.replace('e','z'));
		
		System.out.println(str.replace("Dear", "Respected"));	
		System.out.println(str.replace("are","do"));
		System.out.println(str.replaceFirst("Dear", "Ali"));
		
	}

}
