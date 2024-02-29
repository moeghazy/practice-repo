package come.neotech.lesson09;

public class largestNumberInArray {

	public static void main(String[] args) {

		int[][] numbers = {

				{ 2, 3, 4, 5,45656 },

				{ 77, 66, 999, 6 }, { 77, 8, 9, 10 },

		};
		int largest = numbers[0][0];

		for (int[] raw : numbers) {

			for (int element : raw) {

				if (element > largest) {

					largest = element;
				}
			}

		}
		System.out.println(largest);

	}

}
