package part_03._03_Generics._5_Generics_and_Primitive_Types;

/**
 * This class demonstrates the limitation of generics with primitive types and the use of
 * wrapper classes to overcome this limitation.
 */
public class _5_Generics_and_Primitive_Types {

	public static void main(String[] args) {
		// 1 - Limitation of Generics with Primitives
		// - Generics cannot directly work with primitive types (e.g., int, double, etc.).
		// - Example: We cannot use GenericList<int> because generics only accept
		// reference types (objects).

		// 2 - Using Wrapper Class as a Substitute
		// - To use a primitive type, we substitute it with its corresponding wrapper
		// class.
		// - Example: Using Integer (the wrapper for int) as the type parameter in
		// GenericList.
		// - Primitive to wrapper class mapping:
		// int -> Integer
		// float -> Float
		// boolean -> Boolean
		// and so on.

		GenericList<Integer> numbers = new GenericList<>();

		// 3 - Auto-boxing (int -> Integer)
		// - Java automatically converts the primitive int value '1' into an Integer
		// object when we add it to the list.
		// - This automatic conversion from int to Integer is known as "auto-boxing."
		numbers.add(1); // Equivalent to: numbers.add(Integer.valueOf(1));

		// 4 - Auto-unboxing (Integer -> int)
		// - When retrieving the value from the list, Java automatically converts the
		// Integer object back to an int.
		// - This automatic conversion from Integer to int is called "auto-unboxing."
		int number = numbers.get(0); // Automatically converts Integer to int.
	}

}