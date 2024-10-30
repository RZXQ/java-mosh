package part_02._03_Refactoring_Towards_an_Object_oriented_Design._7_Extracting_the_MortgageCalculator_Class;

public class MortgageCalculator {
	
	private int principal;
	
	private float annualInterest;
	
	private byte years;
	
	public MortgageCalculator(int principal, float annualInterest, byte years) {
		this.principal = principal;
		this.annualInterest = annualInterest;
		this.years = years;
	}
	
	public double calculateMortgage() {
		float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);
		return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
	}
	
	public double calculateBalance(short numberOfPaymentsMade) {
		float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
		short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);
		double balance = principal
				* (Math.pow((1 + monthlyInterest), numberOfPayments)
				- (Math.pow((1 + monthlyInterest), numberOfPaymentsMade)))
				/ (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
		return balance;
	}
	
}
