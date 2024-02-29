package com.neotech.HomePracticReview03;

public class Twod_ArrayReview2 {

	public static void main(String[] args) {

		int[][] nums = { { 2, 8, 6 },

				{ 6, 0, 7 },

				{ 9, 7, 0 },

				{ 9, 5, 2 } };

		for (int[] raw : nums) {

			for (int element : raw) {

				System.out.print(element + " ,");

			}

			System.out.println();

		}

	int[] raw2 = nums[2];
	
	for (  int el : raw2) {
		System.out.print(el + "----- ,");
	}
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
