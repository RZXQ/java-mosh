package part_03._05_Lambda_Expressions_and_Functional_Interfaces._15_The_BinaryOperator_Interface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

/// Demonstration of the BinaryOperator interface and its usage in Java.
///
/// 1. BinaryOperator Interface:
///    - Interface: BinaryOperator<T>
///    - Method: T apply(T t1, T t2)
///    - Purpose: Represents an operation upon two operands of the same type, producing a result of the same type.
///
/// 2. Primitive Variants:
///    - Interface: IntBinaryOperator
///      - Method: int applyAsInt(int left, int right)
///      - Purpose: Represents an operation upon two int operands, producing an int result.
///    - Similar interfaces: LongBinaryOperator, DoubleBinaryOperator, etc.
///
/// 3. Function Chaining:
///    - Use `andThen(Function after)` to apply a second operation after the current operation.
public class LambdasDemo {

	public static void show() {
		// Demonstrating BinaryOperator usage with different approaches

		// 1. Using an anonymous inner class
		BinaryOperator<Integer> addAnonymous = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer a, Integer b) {
				return a + b;
			}
		};

		// 2. Using a lambda expression
		BinaryOperator<Integer> addLambda = (a, b) -> a + b;

		// 3. Using a method reference
		// Note: For primitive types, using IntBinaryOperator is more efficient.
		BinaryOperator<Integer> addMethodRef = Integer::sum;

		// Printing results for the above approaches
		System.out.println("Anonymous Class: " + addAnonymous.apply(1, 2));
		System.out.println("Lambda Expression: " + addLambda.apply(1, 2));
		System.out.println("Method Reference: " + addMethodRef.apply(1, 2));

		// 4. Function chaining: Combining BinaryOperator and Function
		// Task: Add two integers, then square the result.
		BinaryOperator<Integer> add = (a, b) -> a + b;
		Function<Integer, Integer> square = a -> a * a;

		// Using `andThen` to chain functions
		System.out.println("Chaining: " + add.andThen(square).apply(1, 2));
	}

}