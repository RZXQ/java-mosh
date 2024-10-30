package part_02._03_Refactoring_Towards_an_Object_oriented_Design._7_Extracting_the_MortgageCalculator_Class;

import java.text.NumberFormat;

public class MortgageReport {
	
	private static MortgageCalculator calculator; // Introduce field: option + command + f
	
	public static void printMortgage(int principal, float annualInterest, byte years) {
		calculator = new MortgageCalculator(principal, annualInterest, years);
		double mortgage = calculator.calculateMortgage();
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}

	// change signature: command + f6
	public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for (short month = 0; month < years * Main.MONTHS_IN_YEAR; month++) {
			double balance = calculator.calculateBalance(month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

}
