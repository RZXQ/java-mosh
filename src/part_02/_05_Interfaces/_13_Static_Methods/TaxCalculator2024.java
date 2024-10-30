package part_02._05_Interfaces._13_Static_Methods;

public class TaxCalculator2024 extends AbstractTaxCalculator {

	private double texableIncome;

	public TaxCalculator2024(double texableIncome) {
		this.texableIncome = texableIncome;
	}

	@Override
	public double calculateTax() {
		// getTaxableIncome();
		return this.texableIncome * 0.3;
	}

}
