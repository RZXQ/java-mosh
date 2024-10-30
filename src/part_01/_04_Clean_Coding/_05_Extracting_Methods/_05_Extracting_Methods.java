package part_01._04_Clean_Coding._05_Extracting_Methods;

import java.text.NumberFormat;
import java.util.Scanner;

public class _05_Extracting_Methods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int principal;
		while (true) {
			System.out.print("Principal: ");
			principal = scanner.nextInt();
			if (principal >= 1000 && principal <= 1_000_000)
				break;
			System.out.println("Enter a value between 1000 and 1000000");
		}

		float annualInterest;
		while (true) {
			System.out.print("Annual Interest Rate: ");
			annualInterest = scanner.nextFloat();
			if (annualInterest >= 1 && annualInterest <= 30) {
				break;
			}
			System.out.println("Enter a value between 1 and 30");
		}

		byte years;
		while (true) {
			System.out.print("Period (Years): ");
			years = scanner.nextByte();
			if (years >= 1 && years <= 30) {
				break;
			}
			System.out.println("Enter a value between 1 and 30.");
		}

		double mortgage = calculateMortgage(principal, annualInterest, years);

		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
	}

	private static double calculateMortgage(int principal, float annualInterest, byte years) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;

		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

		return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	}

}
