package part_02._05_Interfaces._3_Tightly_coupled_Code;

public class TaxReport {

	private TaxCalculator calculator;

	public TaxReport() {
		this.calculator = new TaxCalculator(100_000);
	}

	public void show() {
		System.out.println(calculator.calculateTax());
	}

}
