package com.neotech.HomePracticReview03;

public class LargestAndScond_Largest {

	public static void main(String[] args) {

		int[] numbers = { 23456, 45, 765, 978787878, 65, 75, };

		int bigest = numbers[0];
		int secondbigest =numbers[0];

		for (int number : numbers) {

			if (number > bigest) {

				secondbigest = bigest;

				bigest = number;

			} else if (number > secondbigest && number != bigest) {
				secondbigest = number;

			}

		}
		System.out.println(" bigest num is --> " + bigest);

	
	     System.out.print(" the second bigest num " + secondbigest);

	}


}
