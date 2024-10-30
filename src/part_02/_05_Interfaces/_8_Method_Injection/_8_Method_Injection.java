package part_02._05_Interfaces._8_Method_Injection;

public class _8_Method_Injection {

	public static void main(String[] args) {
		var report = new TaxReport();

		report.show(new TaxCalculator2024(100_000));
		report.show(new TaxCalculator2025(100_000));
	}

}
