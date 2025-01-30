package part_02._02_Classes._7_Encapsulation;

/// Encapsulation: bundle the data and methods that operate on the data in a single unit
public class _7_Encapsulation {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(50_000);
		employee.setHourlyRate(20);

		int wage = employee.calculateWage(20);
		System.out.println(wage);

	}

}
