package part_02._05_Interfaces._7_Setter_Injection;

/// ## Setter Injection:
/// Advantage: Allows the implementation of the TaxCalculator interface to be changed during runtime.
public class TaxReport {
	
	private TaxCalculator calculator;
	
	public void setCalculator(TaxCalculator calculator) {
		this.calculator = calculator;
	}
	
	public void show() {
		System.out.println(calculator.calculateTax());
	}
}