package part_02._05_Interfaces._6_Constructor_Injection;

/// ## Programming against interfaces:
/// TaxReport does not know about the specific implementation of TaxCalculator. It operates using the TaxCalculator interface, which makes the code more flexible and maintainable. This approach is known as programming against interfaces.
///
/// ## Constructor injection(more common approach):
/// Constructor injection is used here to inject the dependency. We avoid creating a new TaxCalculator object using the new keyword.
public class TaxReport {

	private TaxCalculator calculator;


	// Constructor injection
	public TaxReport(TaxCalculator calculator) {
		this.calculator = calculator;
	}

	public void show() {
		System.out.println(calculator.calculateTax());
	}

}