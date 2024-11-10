package part_03._03_Generics._4_Generic_Classes;

/**
 * This class demonstrates the use of generic classes in Java. Generic classes enable type
 * safety and reusability by allowing the creation of a single class that can work with
 * different data types.
 */
public class _4_Generic_Classes {

	public static void main(String[] args) {
		// 1. Benefit: Type Safety with Generics
		// - By specifying the type as Integer, this GenericList only accepts
		// Integer objects, ensuring type safety.
		var list = new GenericList<Integer>();
		list.add(1); // Valid as 1 is an Integer.

		// Uncomment the following line to see the compile-time error:
		// list.add("s"); // Error: The method add(Integer) in the type
		// GenericList<Integer> is not applicable for the arguments (String).

		// 2. Benefit: Cleaner Code with Generics
		// - No need for explicit casting.
		// - Provides compile-time type safety and catches mistakes early.
		int number = list.get(1); // No casting required, avoids runtime errors.
	}

}