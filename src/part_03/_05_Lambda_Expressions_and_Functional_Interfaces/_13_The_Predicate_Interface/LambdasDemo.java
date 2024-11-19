package part_03._05_Lambda_Expressions_and_Functional_Interfaces._13_The_Predicate_Interface;

import java.util.function.Predicate;

/// Demonstration of the Predicate interface and its usage in Java.
///
/// 1. Predicate Interface:
///    - Interface: Predicate<T>
///    - Method: boolean test(T t)
///    - Purpose: Represents a function that takes an argument and returns a boolean result.
///
/// 2. BiPredicate Interface:
///    - Interface: BiPredicate<T, U>
///    - Method: boolean test(T t, U u)
///    - Purpose: Represents a function that accepts two arguments and returns a boolean result.
///
/// 3. Primitive Variants:
///    - IntPredicate:
///      - Method: boolean test(int value)
///      - Purpose: Represents a function that takes an int argument and returns a boolean result.
///
/// This example demonstrates the use of the Predicate interface in Java.
/// Think of a Predicate as a way to test a condition and return true or false.
public class LambdasDemo {

	public static void show() {
		// Using the Predicate interface to test if a string is longer than 5 characters.

		// Option 1: Using an anonymous inner class
		Predicate<String> isLongerThan5 = new Predicate<String>() {
			@Override
			public boolean test(String str) {
				return str.length() > 5;
			}
		};

		// Option 2: Using a lambda expression
		Predicate<String> isLongerThan5Lambda = str -> str.length() > 5;

		// Applying the Predicate to an example string
		String testString = "sky";
		System.out.println("Anonymous Class: " + isLongerThan5.test(testString));
		System.out.println("Lambda Expression: " + isLongerThan5Lambda.test(testString));
	}

}