package part_02._03_Refactoring_Towards_an_Object_oriented_Design._6_Extracting_the_MortgageReport_Class;

public class Main {

	static final byte MONTHS_IN_YEAR = 12;
	static final byte PERCENT = 100;

	public static void main(String[] args) {
		int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
		byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

		MortgageReport.printMortgage(principal, annualInterest, years);
		MortgageReport.printPaymentSchedule(years, principal, annualInterest);
	}

	public static double calculateMortgage(int principal, float annualInterest, byte years) {
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
		return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	}

	public static double calculateBalance(int principal, float annualInterest, byte years, short numberOfPaymentsMade) {
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
		double balance = principal
				* (Math.pow((1 + monthlyInterest), numberOfPayments)
						- (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
				/ (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
		return balance;
	}

}