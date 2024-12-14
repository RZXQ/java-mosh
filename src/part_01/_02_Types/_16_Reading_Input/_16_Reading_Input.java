package part_01._02_Types._16_Reading_Input;

import java.util.Scanner;

public class _16_Reading_Input {

	public static void main(String[] args) {
		// Creates a Scanner to read input from the terminal.
		Scanner scanner = new Scanner(System.in);

		// scanner.nextByte(): Reads the next byte of input and moves the cursor to the
		// same line after the number.
		byte age = scanner.nextByte();

		// scanner.next(): Reads the next token (single word) until a whitespace is
		// encountered, leaving the cursor at the end of the word on the same line.
		String name = scanner.next();

		// scanner.nextLine(): Consumes any leftover newline character before reading the
		// next line. Reads the entire line of input
		String fullName = scanner.nextLine().trim();
	}

}
