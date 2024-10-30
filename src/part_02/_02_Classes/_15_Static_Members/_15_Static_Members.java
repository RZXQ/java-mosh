package part_02._02_Classes._15_Static_Members;

/// | **Type**        | **Static (Class-Level)**                                | **Non-Static (Instance-Level)**                                        |
/// |-----------------|--------------------------------------------------------|------------------------------------------------------------------------|
/// | **Fields**      | One copy shared across all instances.                  | Unique copy for each instance (each instance has its own data).        |
/// | **Methods**     | One copy, shared and associated with the class. Operates on static data only. | One copy of the code, shared across instances, but operates on instance-specific data, giving unique behavior based on the instance. |
/// | **Access**      | Accessed via class name directly.                      | Requires an instance of the class to access.                           |
/// | **Association** | Class itself (not tied to any instance).               | Specific instance (tied to the instance calling it).                   |
///
/// 1. Static = fixed for the class, shared across all objects. Methods and variables are associated with the class itself.
/// 2. Instance = fixed code, but behavior can vary based on the unique state of each object (i.e., the instance variables).

public class _15_Static_Members {

	public static void main(String[] args) {
		Employee employee1 = new Employee(50_000, 20);
		Employee.printNumberOfEmployees();

		int wage = employee1.calculateWage();
		System.out.println(wage);
	}

}