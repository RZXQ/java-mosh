package part_01._03_Control_Flow._11_Do_While_Loops;

import java.util.Locale;
import java.util.Scanner;

public class _11_Do_While_Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = "";
		do {
			System.out.print("Input:");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
		while (!"quit".equals(input));
	}

}
