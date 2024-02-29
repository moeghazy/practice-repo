package com.neotech.HomePracticReview03;

public class DoubleArrayReview {

	public static void main(String[] args) {
		//2d Array is an Array Of  1D -Arrays
	    // every element is an  1 -D  ARRAY
	
	
	int [][]numbers = new int [3] [4] ;
	
	
	numbers [0][2] = 6;
	numbers [2][1] = 9;
	numbers [2][2] = 16;
	numbers [1][1] = 30;
	
	int raw = numbers.length;
	System.out.println("numbers of the raw------>" + raw);
	
	
	int rowlength = numbers[1].length;
	
	System.out.println("the length of raw with index 1 is " +rowlength);
	
	}

}
