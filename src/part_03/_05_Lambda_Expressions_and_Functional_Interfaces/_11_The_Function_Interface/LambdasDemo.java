package part_03._05_Lambda_Expressions_and_Functional_Interfaces._11_The_Function_Interface;

import java.util.function.Function;

/// Demonstration of the Function interface and its usage in Java.
///
/// 1. Function Interface:
///    - Interface: Function<T, R>
///    - Method: R apply(T t)
///    - Purpose: Represents a function that accepts one argument and produces a result.
///
/// 2. BiFunction Interface:
///    - Interface: BiFunction<T, U, R>
///    - Method: R apply(T t, U u)
///    - Purpose: Represents a function that accepts two arguments and produces a result.
///
/// 3. Primitive Variants:
///    - IntFunction<R>:
///      - Method: R apply(int value)
///      - Purpose: Accepts an int argument and produces a result.
///    - ToIntFunction<T>:
///      - Method: int applyAsInt(T value)
///      - Purpose: Accepts an object of type T and produces an int result.
///    - IntToLongFunction:
///      - Method: long applyAsLong(int value)
///      - Purpose: Accepts an int argument and produces a long result.
///
/// This example demonstrates the use of the Function interface in Java.
/// Think of a Function interface as a way to perform a particular action on an input
/// to get an output. In simple words, it takes an input of one type (T) and gives
/// an output of another type (R).
public class LambdasDemo {

	public static void show() {
		// Using the Function interface to map a String to its length.

		// Option 1: Using an anonymous inner class
		Function<String, Integer> map1 = new Function<String, Integer>() {
			@Override
			public Integer apply(String string) {
				return string.length();
			}
		};

		// Option 2: Using a lambda expression
		Function<String, Integer> map2 = string -> string.length();

		// Option 3: Using a method reference
		Function<String, Integer> map3 = String::length;

		/// Applying the functions to the input "Sky"
		System.out.println("Anonymous Class: " + map1.apply("Sky"));
		System.out.println("Lambda Expression: " + map2.apply("Sky"));
		System.out.println("Method Reference: " + map3.apply("Sky"));
	}

}
