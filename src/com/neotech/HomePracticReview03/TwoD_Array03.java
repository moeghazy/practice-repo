package com.neotech.HomePracticReview03;

public class TwoD_Array03 {

	public static void main(String[] args) {

		int[][] nums = { { 5, 2 }, { 9, 4, 6, 1, 8 }, { 8 },

		};
		System.out.println("the  number of the raws--" + nums.length);

		System.out.println("the length of raws with index 1->" + nums[1].length);

		for (int raw = 0; raw < nums.length; raw++) {

			for (int col = 0; col < nums[raw].length; col++) {
				System.out.print(nums[raw][col] + " ");
			}
			System.out.println();

		} // Nested Enhanced for loop

		for (int[] raw : nums) {

			for (int element : raw) {
				System.out.print(element + " ");

			}

			System.out.println();

		}

	}

}
