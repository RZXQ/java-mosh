package part_01._02_Types._08_Arrays;

import java.util.Arrays;

public class _08_Arrays {

	public static void main(String[] args) {
		// Array initialization
		int[] numbers = new int[5]; // Dynamic initialization
		int[] numbers2 = { 2, 3, 5, 1, 4 }; // Static initialization

		// numbers.length
		System.out.println("Length of 'numbers': " + numbers.length);

		// Arrays.sort()
		Arrays.sort(numbers2);

		// Arrays.toString()
		System.out.println("Array 'numbers': " + Arrays.toString(numbers));
	}

}