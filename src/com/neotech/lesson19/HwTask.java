package com.neotech.lesson19;

public class HwTask {

	/*
	 * Create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels. Method should be available inside the
	 * class where it was declared and executed by calling it is name.
	 */

	static public String Vowels(String string) {

	return string.replaceAll("[^aieou]", "");

		
		
	}

	public static void main(String[] args) {

		String string = "I only want To See Vowels In Tnis Sentences ";

		System.out.println(Vowels(string));

	}

}
