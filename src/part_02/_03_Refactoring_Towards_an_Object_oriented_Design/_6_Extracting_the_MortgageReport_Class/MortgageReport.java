package part_02._03_Refactoring_Towards_an_Object_oriented_Design._6_Extracting_the_MortgageReport_Class;

import java.text.NumberFormat;

public class MortgageReport {

	public static void printMortgage(int principal, float annualInterest, byte years) {
		double mortgage = Main.calculateMortgage(principal, annualInterest, years);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}

	public static void printPaymentSchedule(byte years, int principal, float annualInterest) {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for (short month = 0; month < years * Main.MONTHS_IN_YEAR; month++) {
			double balance = Main.calculateBalance(principal, annualInterest, years, month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

}
