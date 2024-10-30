package part_01._03_Control_Flow._12_Break_and_Continue_Statements;

import java.util.Scanner;

public class _12_Break_and_Continue_Statements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();

			// break:
			if ("quit".equals(input)) {
				break;
			}

			// pass:
			if ("pass".equals(input)) {
				continue;
			}

			System.out.println(input);
		}
	}

}
