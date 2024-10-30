package part_02._03_Refactoring_Towards_an_Object_oriented_Design._8_Moving_Away_from_Static_Members;

import java.text.NumberFormat;

// find usage: option + f7
public class MortgageReport {

	// highlight usage: command + f7
	private MortgageCalculator calculator; // Introduce field: option + command + f

	public MortgageReport(MortgageCalculator calculator) {
		this.calculator = calculator;
	}

	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println();
		System.out.println("MORTGAGE");
		System.out.println("--------");
		System.out.println("Monthly Payments: " + mortgageFormatted);
	}

	// change signature: command + f6
	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");
		for (short month = 0; month < calculator.getYears() * Main.MONTHS_IN_YEAR; month++) {
			double balance = calculator.calculateBalance(month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

}
