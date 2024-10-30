package part_01._03_Control_Flow._10_While_Loops;

import java.util.Scanner;

public class _10_While_Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = "";
		while (!"quit".equals(input)) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
	}

}
