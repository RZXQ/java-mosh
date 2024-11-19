package part_03._05_Lambda_Expressions_and_Functional_Interfaces._16_The_UnaryOperator_Interface;

import java.util.function.UnaryOperator;

/// Demonstration of the UnaryOperator interface and its usage in Java.
///
/// 1. UnaryOperator Interface:
///    - Interface: UnaryOperator<T>
///    - Method: T apply(T t)
///    - Purpose: Represents an operation on a single operand that produces a result
///      of the same type as its operand.
///
/// 2. Function Chaining:
///    - Use `andThen(Function after)` to apply an additional operation after the current one.
///    - Use `compose(Function before)` to apply an operation before the current one.
public class LambdasDemo {

	public static void show() {
		// Demonstrating UnaryOperator with different operations

		// 1. Defines a UnaryOperator that squares an Integer.
		UnaryOperator<Integer> square = n -> n * n;

		// 2. Defines a UnaryOperator that increments an Integer by 1.
		UnaryOperator<Integer> increment = n -> n + 1;

		// 3. Function chaining using `andThen`
		// Task: Square the number, then increment the result.
		// Explanation for square.andThen(increment).apply(2):
		// - First, it calculates 2 * 2 = 4.
		// - Then, it calculates 4 + 1 = 5.
		System.out.println("Using andThen: " + square.andThen(increment).apply(2)); // Output:
																					// 5

		// 4. Function chaining using `compose`
		// Task: Increment the number first, then square the result.
		// Explanation for increment.compose(square).apply(2):
		// - First, it calculates 2 * 2 = 4.
		// - Then, it calculates 4 + 1 = 5.
		System.out.println("Using compose: " + increment.compose(square).apply(2)); // Output:
																					// 5
	}

}