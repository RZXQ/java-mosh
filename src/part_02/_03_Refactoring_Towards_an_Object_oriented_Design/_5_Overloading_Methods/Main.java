package part_02._03_Refactoring_Towards_an_Object_oriented_Design._5_Overloading_Methods;

import java.text.NumberFormat;

public class Main {

	static final byte MONTHS_IN_YEAR = 12;
	static final byte PERCENT = 100;

	public static void main(String[] args) {
		int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
		byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

		printMortgage(principal, annualInterest, years);
		printPaymentSchedule(years, principal, annualInterest);
	}

	private static void printMortgage(int principal, float annualInterest, byte years) {
		double mortgage = calculateMortgage(principal, annualInterest, years);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}

	private static void printPaymentSchedule(byte years, int principal, float annualInterest) {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for (short month = 0; month < years * MONTHS_IN_YEAR; month++) {
			double balance = calculateBalance(principal, annualInterest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

	private static double calculateMortgage(int principal, float annualInterest, byte years) {
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
		return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	}

	private static double calculateBalance(int principal, float annualInterest, byte years,
			short numberOfPaymentsMade) {
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
		double balance = principal
				* (Math.pow((1 + monthlyInterest), numberOfPayments)
						- (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
				/ (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
		return balance;
	}

}