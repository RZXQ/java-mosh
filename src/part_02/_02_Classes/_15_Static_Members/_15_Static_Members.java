package part_02._02_Classes._15_Static_Members;

public class _15_Static_Members {

	public static void main(String[] args) {

		Employee employee1 = new Employee(50_000, 20);
		Employee.printNumberOfEmployees();

		int wage = employee1.calculateWage();
		System.out.println(wage);
	}

}