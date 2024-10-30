package part_02._03_Refactoring_Towards_an_Object_oriented_Design._11_Extracting_getRemainingBalances_Title;

import java.text.NumberFormat;

public class MortgageReport {

	private final MortgageCalculator calculator;

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

	public void printPaymentSchedule() {
		System.out.println();
		System.out.println("PAYMENT SCHEDULE");
		System.out.println("----------------");

		for (double balance : calculator.getRemainingBalances()) {
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}

}
