package part_02._02_Classes._14_Constructor_Overloading;

public class _14_Constructor_Overloading {

	public static void main(String[] args) {
		// show parameter info: command + p
		Employee employee1 = new Employee(10_000);
		Employee employee2 = new Employee(50_000, 20);

		int wage = employee1.calculateWage();
		System.out.println(wage);
	}

}
