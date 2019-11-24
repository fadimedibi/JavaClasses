package com.class24;

public class Country {

	public String capital, name;
	public int population;
	
	Country(){
		System.out.println("I am non argument constructor");
	}
	
	Country(String name, String capital, int population){
		this.name=name;
		this.capital=capital;
		this.population=population;
		}
	
	public void displayInfo() {
		System.out.println(name+" "+capital+" "+population);
	}
	
	public static void main(String[] args) {
		
//		Country country1=new Country();
//		country1.name="USA";
//		country1.capital="Washington DC";
//		
//		Country country2=new Country();
//		country1.name="Kazakhstan";
//		country1.capital="Astana";
//		System.out.println(country1.name);	//if you don't have a method (displayInfo) you need to write syso for each country
//		System.out.println(country1.capital); //if you don't have a method (displayInfo) you need to write syso for each country
		
		
		Country country1=new Country("USA","Washington DC",350);
		Country country2=new Country("Kazakhstan", "Astana",18);
		Country country3=new Country();
		
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
	
			}
	
	
}
