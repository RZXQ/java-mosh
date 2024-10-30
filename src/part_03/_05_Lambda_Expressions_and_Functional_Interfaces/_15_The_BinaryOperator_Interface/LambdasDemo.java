package part_03._05_Lambda_Expressions_and_Functional_Interfaces._15_The_BinaryOperator_Interface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdasDemo {

	public static void show() {
		// BinaryOperator represents an operation upon two operands of the same type,
		// producing a result of the same type.
		// Here, we define a BinaryOperator that adds two Integer values.
		BinaryOperator<Integer> add = (a, b) -> a + b;

		// Function represents a function that takes one input and produces an output.
		// Here, we define a Function that takes an Integer and returns its square.
		Function<Integer, Integer> square = a -> a * a;

		// Using the andThen method, we chain the add and square functions.
		// The andThen method first applies the add operation, then applies the square
		// function to the result.
		// add.andThen(square).apply(1, 2):
		// First, it calculates 1 + 2 = 3, then it calculates 3 * 3 = 9.
		System.out.println(add.andThen(square).apply(1, 2)); // Output: 9
	}

}