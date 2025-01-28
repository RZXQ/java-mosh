package part_01._02_Types._09_Multi_dimensional_Arrays;

import java.util.Arrays;

public class _09_Multi_dimensional_Arrays {

	/*
	 * ===============================================================================
	 * Multi-Dimensional Arrays in Java
	 * ===============================================================================
	 */

	public static void main(String[] args) {

		/*
		 * ===============================================================================
		 * Multi-Dimensional Array Initialization
		 * ===============================================================================
		 */
		int[][] numbers = new int[2][3]; // Dynamic initialization (default values: 0)
		int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Static initialization

		/*
		 * ===============================================================================
		 * Convert Multi-Dimensional Array to String
		 * ===============================================================================
		 */
		System.out.println(Arrays.deepToString(numbers));
	}

}
