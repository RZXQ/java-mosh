package part_03._03_Generics._5_Generics_and_Primitive_Types;

/// 1. Primitive types cannot be used directly as type parameters in generics.
///    For example, you cannot have GenericList<int> because generics require reference types (objects).
///
/// 2. Each primitive type has a corresponding wrapper class that can be used with generics:
///    - int     -> Integer
///    - float   -> Float
///    - boolean -> Boolean
///    - char    -> Character
///    - double  -> Double
///    - long    -> Long
///    - short   -> Short
///    - byte    -> Byte
///
/// 3. Since Java 7, the diamond operator (<>) allows us to omit the type arguments
///    on the right-hand side of a generic class instantiation when they can be inferred.
///    This makes the code cleaner and less repetitive.

public class _5_Generics_and_Primitive_Types {

	public static void main(String[] args) {

		// Using the wrapper class Integer as the type parameter instead of the primitive
		// int.
		GenericList<Integer> numbers = new GenericList<>();

		// Auto-boxing: Java automatically converts the primitive int '1' to an Integer
		// object.
		numbers.add(1);

		// Auto-unboxing: Java automatically converts the Integer object back to a
		// primitive int.
		int number = numbers.get(0);
	}

}
