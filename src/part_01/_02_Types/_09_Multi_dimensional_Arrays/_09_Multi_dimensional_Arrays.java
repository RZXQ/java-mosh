package part_01._02_Types._09_Multi_dimensional_Arrays;

import java.util.Arrays;

public class _09_Multi_dimensional_Arrays {
    public static void main(String[] args) {
        // Initialize a 2x3 2D array with default values (0s by default for int)
        int[][] numbers = new int[2][3];

        // Modify an element in the 2D array
        numbers[0][0] = 1; // Set the first element of the first row to 1

        // Print the contents of the 2D array using Arrays.deepToString() for full structure
        System.out.println("2D Array 'numbers': " + Arrays.deepToString(numbers)); // Outputs entire 2D array

        // Initialize a 2D array with preset values
        int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}}; // 2 rows, 3 columns filled with specific values

        // Print the second 2D array in its entirety
        System.out.println("2D Array 'numbers2': " + Arrays.deepToString(numbers2)); // Displays complete array
    }
}