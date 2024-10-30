package part_02._05_Interfaces._3_Tightly_coupled_Code;

public class TaxCalculator {

	private double texableIncome;

	public TaxCalculator(double texableIncome) {
		this.texableIncome = texableIncome;
	}

	public double calculateTax() {
		return this.texableIncome * 0.3;
	}

}
