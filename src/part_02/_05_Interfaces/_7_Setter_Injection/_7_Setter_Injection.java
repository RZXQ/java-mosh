package part_02._05_Interfaces._7_Setter_Injection;

public class _7_Setter_Injection {

	public static void main(String[] args) {
		var report = new TaxReport();

		report.setCalculator(new TaxCalculator2024(10_000));
		report.show();

		// set another implementation of TaxCalculator
		report.setCalculator(new TaxCalculator2025(10_000));
		report.show();
	}

}
