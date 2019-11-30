package com.class25_1;

public class Private {
//  Create 1 class with a private method that has 3 overloaded forms.
//	Then call each overloaded method with specific arguments and observe result.
	
	private void method()
	{
		System.out.println("No parameter today is definitelly Sunday");
	}	
	private void method(String day)
	{
		System.out.println("one parameter next Thursday is "+day );
	}	
	private void method(String month, int date)
	{
		System.out.println("Two parameters Winter break is soon but not for me!! "+month+ " "+date);
	}	

	public static void main(String[] args) {
		Private p=new Private();
		p.method();
		p.method("Thanksgiving Day!!");
		p.method("December", 25);
	}
	
	
}
