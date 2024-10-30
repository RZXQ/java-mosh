package part_02._02_Classes._13_Method_Overloading;

///  **Method overloading** is determined by the method name and the parameter list (the number, type, and order of parameters).
///
/// #### Key Points:
///
/// 1. **Method Overloading**:
///    - Method overloading allows a class to have multiple methods with the same name but different parameter lists.
///    - The parameter lists must differ in at least one of the following ways:
///      - Number of parameters.
///      - Type of parameters.
///      - Order of parameters.
///
/// 2. **Return Type**:
///    - The return type is not considered when determining method overloading.
///    - Two methods cannot be overloaded solely by differing return types.
///    - If two methods have the same name and parameter list but different return types, it will result in a compile-time error.
public class _13_Method_Overloading {

	public static void main(String[] args) {
		Employee employee = new Employee(50_000, 20);

		int wage = employee.calculateWage();
		System.out.println(wage);
	}

}
