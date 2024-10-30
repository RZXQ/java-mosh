package part_02._05_Interfaces._8_Method_Injection;

/// ## Method Injection:
/// Benefit: Allows injecting the required instance directly into the method at the time it is needed.
public class TaxReport {

	public void show(TaxCalculator calculator) {
		System.out.println(calculator.calculateTax());
	}

}