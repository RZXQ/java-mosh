package part_02._03_Refactoring_Towards_an_Object_oriented_Design._10_Extracting_Duplicate_Logic;

public class MortgageCalculator {

	public static final byte MONTHS_IN_YEAR = 12;
	public static final byte PERCENT = 100;

	private int principal;
	private float annualInterest;
	private byte years;

	public MortgageCalculator(int principal, float annualInterest, byte years) {
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}

	public double calculateMortgage() {
		float monthlyInterest = getMonthlyInterest();
		short numberOfPayments = getNumberOfPayments();
		return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	}

	public double calculateBalance(short numberOfPaymentsMade) {
		float monthlyInterest = getMonthlyInterest();
		short numberOfPayments = getNumberOfPayments();
		double balance = principal
				* (Math.pow((1 + monthlyInterest), numberOfPayments)
						- (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
				/ (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
		return balance;
	}

	public byte getYears() {
		return years;
	}

	// maintain a logical flow where the more significant public methods are available
	// first, and helper methods are placed afterwards. This organization can often lead
	// to better readability and maintenance of your code.
	private float getMonthlyInterest() {
		return annualInterest / PERCENT / MONTHS_IN_YEAR;
	}

	private short getNumberOfPayments() {
		return (short) (years * MONTHS_IN_YEAR);
	}
}
