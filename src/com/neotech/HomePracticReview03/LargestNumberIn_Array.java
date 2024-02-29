package com.neotech.HomePracticReview03;

public class LargestNumberIn_Array {

	public static void main(String[] args) {
		// find the biggest number in a 2 D Array

		int[][] nums = { { 2, 5, 4000 },
				{ 6, 0, 7, }, 
				{ 9, 5, -2 }, 
				{ 8, 11, 4 } };

		int biggest = nums[0][0];

		for (int row = 0; row < nums.length; row++) {

			for (int col = 0; col < nums[row].length; col++) {

				int element = nums[row][col];

				if (element > biggest) {
					biggest = element;
				}

			}

		}
		System.out.println("the biggest number is --->" + biggest);

	   System.out.println();
	
	int max = nums [0][0];
	
	for(int[] row : nums) {
		
		for(int element : row ) {
			if (element > max) {
				max = element ;
			}
		
		}
	
	}System.out.println("the max number is--->" + max);
	
	
	
	
	
	
	
	}

}
