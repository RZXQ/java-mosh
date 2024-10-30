package part_02._03_Refactoring_Towards_an_Object_oriented_Design._7_Extracting_the_MortgageCalculator_Class;

public class Main {

	static final byte MONTHS_IN_YEAR = 12;
	static final byte PERCENT = 100;

	public static void main(String[] args) {
		int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
		byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

		MortgageReport.printMortgage(principal, annualInterest, years);
		MortgageReport.printPaymentSchedule(principal, annualInterest, years);
	}
	
}