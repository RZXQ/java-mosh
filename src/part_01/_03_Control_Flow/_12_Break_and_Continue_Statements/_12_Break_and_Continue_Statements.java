package part_01._03_Control_Flow._12_Break_and_Continue_Statements;

import java.util.Scanner;

public class _12_Break_and_Continue_Statements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Input: ");
			String input = scanner.next().toLowerCase();

			/*
			 * ===========================================================================
			 * Break
			 * ===========================================================================
			 */
			if ("break".equals(input)) {
				break;
			}

			/*
			 * ===========================================================================
			 * Continue
			 * ===========================================================================
			 */
			if ("continue".equals(input)) {
				continue;
			}

			System.out.println(input);
		}

		scanner.close();
	}

}
