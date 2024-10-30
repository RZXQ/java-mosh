package part_02._03_Refactoring_Towards_an_Object_oriented_Design._8_Moving_Away_from_Static_Members;

public class Main {

	static final byte MONTHS_IN_YEAR = 12;
	static final byte PERCENT = 100;

	public static void main(String[] args) {
		int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
		float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
		byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

		MortgageCalculator calculator = new MortgageCalculator(principal, annualInterest, years);
		MortgageReport report = new MortgageReport(calculator);
		report.printMortgage();
		report.printPaymentSchedule();
	}

}