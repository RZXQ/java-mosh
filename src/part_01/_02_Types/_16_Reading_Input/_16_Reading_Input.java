package part_01._02_Types._16_Reading_Input;

import java.util.Scanner;

public class _16_Reading_Input {

	public static void main(String[] args) {
		// Read input from the terminal (System.in)
		Scanner scanner = new Scanner(System.in);

		System.out.print("Age: ");
		// scanner.nextByte():
		byte age = scanner.nextByte();
		System.out.println("You are " + age);

		System.out.print("Name: ");
		// scanner.next(): reads only one token (word) until whitespace
		String name = scanner.next();
		System.out.println(name);

		System.out.print("Full Name: ");
		// scanner.nextLine(): consumes the entire current line, including the newline
		// character, and moves the cursor to the beginning of the next line
		scanner.nextLine();
		String fullName = scanner.nextLine().trim(); // method chaining
		System.out.println(fullName);
	}

}