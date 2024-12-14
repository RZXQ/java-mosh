package part_01._02_Types._09_Multi_dimensional_Arrays;

import java.util.Arrays;

public class _09_Multi_dimensional_Arrays {

	public static void main(String[] args) {
		int[][] numbers = new int[2][3]; // Dynamic initialization

		int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Static initialization

		// Arrays.deepToString()
		System.out.println(Arrays.deepToString(numbers));
	}

}