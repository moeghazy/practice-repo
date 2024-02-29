package com.neotech.lesson15;

public class Practic_Hw {

	public static void main(String[] args) {

		/*
		 * Homework 1: Create a String and print it in reverse order (Sunday → yadnuS).
		 * Solve it using charAt(), toCharArray() and reverse() methods. Note: for
		 * charAt() and toCharArray() use String for reverse you have to declare a
		 * StringBuffer object
		 */

		// **charAt()**\\

		String word = "Sunday";

		for (int i = word.length() - 1; i >= 0; i--) {

			System.out.print(word.charAt(i));

		}
		System.out.println("");

		// **CharArray()**\\

		char[] chr = word.toCharArray();

		for (int i = chr.length - 1; i >= 0; i--) {
			System.out.print(chr[i]);
		}

		System.out.println("");

		// **reverse**\\

		StringBuffer sunday = new StringBuffer(word);

		System.out.println(sunday.reverse());

	}

}
