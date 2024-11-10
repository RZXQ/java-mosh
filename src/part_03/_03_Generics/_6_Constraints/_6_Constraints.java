package part_03._03_Generics._6_Constraints;

public class _6_Constraints {

	public static void main(String[] args) {
		// 1 - Example: Using Constraints in Generics
		// - Uncomment the line below to create a `GenericList` restricted to
		// types that are instances of `Number` or its subclasses (e.g., Integer, Float).
		// var list = new GenericList<Number>();

		// 2 - Using `User` in a `GenericList`
		// - Here, we create a `GenericList` that accepts `User` objects because
		// `User` implements both `Comparable` and `Cloneable` interfaces, which
		// are the constraints specified in `GenericList`.
		new GenericList<User>();
	}

}