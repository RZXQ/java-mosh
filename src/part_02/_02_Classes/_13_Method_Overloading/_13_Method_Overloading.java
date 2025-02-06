package part_02._02_Classes._13_Method_Overloading;

public class _13_Method_Overloading {

	public static void main(String[] args) {
		Employee employee = new Employee(50_000, 20);

		int wage = employee.calculateWage();
		System.out.println(wage);
	}

}
