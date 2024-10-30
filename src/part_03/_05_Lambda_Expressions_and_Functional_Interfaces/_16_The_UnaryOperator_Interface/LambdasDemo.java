package part_03._05_Lambda_Expressions_and_Functional_Interfaces._16_The_UnaryOperator_Interface;

import java.util.function.UnaryOperator;

/// This class demonstrates the use of the UnaryOperator interface in Java.
/// - UnaryOperator is a specialized form of Function that takes a single argument
///   of type T and returns a result of the same type T.
///
/// Key Points:
/// 1. **UnaryOperator**:
///    - Syntax: UnaryOperator<T> where T is the type of the operand and result.
///    - Example:
///      - `square` is a UnaryOperator that squares an Integer.
///        - Definition: `UnaryOperator<Integer> square = n -> n * n;`
///      - `increment` is a UnaryOperator that increments an Integer by 1.
///        - Definition: `UnaryOperator<Integer> increment = n -> n + 1;`
///
/// 2. **Function Chaining with andThen**:
///    - The `andThen` method is used to chain functions.
///    - In this example, it first applies the `square` operation, then applies the `increment` operation to the result.
///    - `square.andThen(increment).apply(2)`:
///      - First, it calculates 2 * 2 = 4.
///      - Then, it computes 4 + 1 = 5.
///
/// This example illustrates how to combine simple operations to achieve more complex functionality in a clean and readable way.
public class LambdasDemo {

	public static void show() {
		// Defines a UnaryOperator that squares an Integer.
		UnaryOperator<Integer> square = n -> n * n;

		// Defines a UnaryOperator that increments an Integer by 1.
		UnaryOperator<Integer> increment = n -> n + 1;

		// Chains the square and increment functions using the andThen method.
		// First, the square operation is applied, then the increment function is applied
		// to the result.
		// square.andThen(increment).apply(2):
		// - First, it calculates 2 * 2 = 4.
		// - Then, it calculates 4 + 1 = 5.
		System.out.println(square.andThen(increment).apply(2)); // Output: 5
	}

}