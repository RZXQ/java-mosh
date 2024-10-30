package part_02._03_Refactoring_Towards_an_Object_oriented_Design._4_Extracting_the_Console_Class;

import java.util.Scanner;

/// Move members: F6
/// Visibility: Public
public class Console {

	public static double readNumber(String prompt, double min, double max) {
		Scanner scanner = new Scanner(System.in);
		double value;
		while (true) {
			System.out.print(prompt);
			value = scanner.nextDouble();
			if (value >= min && value <= max) {
				break;
			}
			System.out.println("Enter a value between " + min + " and " + max);
		}
		return value;
	}

}
