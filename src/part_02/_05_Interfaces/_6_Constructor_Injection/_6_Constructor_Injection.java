package part_02._05_Interfaces._6_Constructor_Injection;

public class _6_Constructor_Injection {
 
	public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator2024(100_000);
        TaxReport report = new TaxReport(calculator);
        report.show();
	}

}
