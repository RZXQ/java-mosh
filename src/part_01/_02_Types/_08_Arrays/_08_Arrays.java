package part_01._02_Types._08_Arrays;

import java.util.Arrays;

public class _08_Arrays {

	public static void main(String[] args) {
		// Initialize and modify the first array
		int[] numbers = new int[5];
		numbers[0] = 1; // Modify first element

		// Print the initial array
		System.out.println("Array 'numbers': " + Arrays.toString(numbers)); // Arrays.toString()

		// Initialize, sort and print the second array
		int[] numbers2 = { 2, 3, 5, 1, 4 };
		Arrays.sort(numbers2); // Arrays.sort()

		// Print length and sorted array
		System.out.println("Length of 'numbers': " + numbers.length); // numbers.length
		System.out.println("Sorted array 'numbers2': " + Arrays.toString(numbers2)); // Arrays.toString()
	}

}