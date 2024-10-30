package part_02._05_Interfaces._12_Fields;

public class TaxCalculator2024 implements TaxCalculator {

	private double texableIncome;

	public TaxCalculator2024(double texableIncome) {
		this.texableIncome = texableIncome;
	}

	@Override
	public double calculateTax() {
		return this.texableIncome * 0.3;
	}

}
