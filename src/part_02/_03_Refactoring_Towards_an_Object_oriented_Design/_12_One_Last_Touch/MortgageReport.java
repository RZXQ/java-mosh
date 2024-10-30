package part_02._03_Refactoring_Towards_an_Object_oriented_Design._12_One_Last_Touch;

import java.text.NumberFormat;

public class MortgageReport {

	private final NumberFormat currency;

	private final MortgageCalculator calculator;

	public MortgageReport(MortgageCalculator calculator) {
		this.calculator = calculator;
		this.currency = NumberFormat.getCurrencyInstance();
	}

	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		String mortgageFormatted = currency.format(mortgage);
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
			System.out.println(currency.format(balance));
		}
	}

}
