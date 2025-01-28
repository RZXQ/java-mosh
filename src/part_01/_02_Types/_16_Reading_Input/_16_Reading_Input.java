package part_01._02_Types._16_Reading_Input;

import java.util.Scanner;

public class _16_Reading_Input {

	public static void main(String[] args) {

		/*
		 * ===============================================================================
		 * Scanner for Reading Input
		 * ===============================================================================
		 */
		Scanner scanner = new Scanner(System.in);

		/*
		 * ===============================================================================
		 * scanner.nextByte()
		 * ===============================================================================
		 */
		byte age = scanner.nextByte(); // Reads a single byte value (e.g., age)

		/*
		 * ===============================================================================
		 * scanner.next()
		 * ===============================================================================
		 */
		String name = scanner.next();
		// Reads a single word (stops at whitespace, e.g., "John" from "John Doe")

		/*
		 * ===============================================================================
		 * scanner.nextLine()
		 * ===============================================================================
		 */
		scanner.nextLine(); // Consumes leftover newline from previous input
		String fullName = scanner.nextLine().trim();
		// Reads the entire line, including spaces (e.g., "John Doe")

		scanner.close(); // Close the scanner to prevent resource leaks
	}

}
