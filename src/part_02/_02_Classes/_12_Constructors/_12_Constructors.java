package part_02._02_Classes._12_Constructors;

public class _12_Constructors {

	public static void main(String[] args) {
		Employee employee = new Employee(50_000, 20);

		int wage = employee.calculateWage(10);
		System.out.println(wage);
	}

}
