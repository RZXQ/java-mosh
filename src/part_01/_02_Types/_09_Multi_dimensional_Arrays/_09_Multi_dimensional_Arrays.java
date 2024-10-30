package part_01._02_Types._09_Multi_dimensional_Arrays;

import java.util.Arrays;

public class _09_Multi_dimensional_Arrays {

	public static void main(String[] args) {
		// Initialize and modify a 2D array
		int[][] numbers = new int[2][3];
		numbers[0][0] = 1; // Modify value

		// Print the 2D array using Arrays.deepToString()
		System.out.println("2D Array 'numbers': " + Arrays.deepToString(numbers)); // Arrays.deepToString()

		// Initialize and print another 2D array
		int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println("2D Array 'numbers2': " + Arrays.deepToString(numbers2)); // Arrays.deepToString()
	}

}