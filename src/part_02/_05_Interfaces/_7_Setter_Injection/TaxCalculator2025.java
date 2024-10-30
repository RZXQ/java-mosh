package part_02._05_Interfaces._7_Setter_Injection;

public class TaxCalculator2025 implements TaxCalculator {

	private double texableIncome;

	public TaxCalculator2025(double texableIncome) {
		this.texableIncome = texableIncome;
	}

	// using Command + I to implement a method
	@Override
	public double calculateTax() {
		return this.texableIncome * 0.2;
	}

}
