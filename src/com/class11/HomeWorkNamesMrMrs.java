package com.class11;

public class HomeWorkNamesMrMrs {

	public static void main(String[] args) {
		// Create a 2D array where you will store the following values:
		// Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:
		// Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String[][] name = { 
				{ "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Jackson", "Jordan", "Obama" } 
				};
		//for (int i = 0; i < name.length; i++) {
			//for (int j = 0; j < name[i].length; j++) {
				//System.out.print(name[i][j]+" ");
				
				
				for (int i = 0; i<name.length; i++){
					   for (int j = 0; j< name[i].length; j++){
						   System.out.print(name[i][j]+name[i][j]+" ");
					   }
			}
			System.out.println();
			System.out.println("*****************");
			 String[][] cartoons = {
				        { "Flintstones", "Fred", "Wilma", "Pebbles", "Dino" },
				        { "Rubbles", "Barney", "Betty", "Bam Bam" },
				        { "Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro" },
				        { "Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne" } };

				    for (int i = 0; i < cartoons.length; i++) {
				      System.out.print(cartoons[i][0] + ": ");
				      for (int j = 1; j < cartoons[i].length; j++) {
				        System.out.print(cartoons[i][j] + " ");
				      }
				      System.out.println();
				    }
		}
		
		
		
		
		
	}

