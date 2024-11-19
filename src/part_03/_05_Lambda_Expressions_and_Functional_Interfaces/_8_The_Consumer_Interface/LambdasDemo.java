package part_03._05_Lambda_Expressions_and_Functional_Interfaces._8_The_Consumer_Interface;

import java.util.List;
import java.util.function.Consumer;

// Demonstration of the Consumer interface and its usage in Java.

// 1. Consumer Interface:
//    - Interface: Consumer<T>
//    - Method: void accept(T t)
//    - Purpose: Represents an operation that accepts a single input argument
//      and returns no result.

// 2. BiConsumer Interface:
//    - Interface: BiConsumer<T, U>
//    - Method: void accept(T t, U u)
//    - Purpose: Represents an operation that accepts two input arguments
//      and returns no result.

// 3. IntConsumer Interface (and other primitive variants):
//    - Interface: IntConsumer
//    - Method: void accept(int value)
//    - Purpose: Represents an operation that accepts a single int-valued
//      argument and returns no result.
//    - Similar interfaces: LongConsumer, DoubleConsumer, etc.

public class LambdasDemo {

	public static void show() {
		// Create a list of integers.
		List<Integer> list = List.of(1, 2, 3);

		// 1. Traditional way to iterate over the list using a for-each loop.
		// This is imperative programming: specifying HOW something should be done
		// using control flow statements like loops and conditionals.
		for (var item : list) {
			System.out.println(item);
		}

		// 2. Using the forEach method with different forms of Consumers.
		// The forEach method accepts a Consumer<? super Integer> action.
		// We need to provide an implementation of Consumer that takes an Integer
		// and performs an action (in this case, printing the integer).
		// This is declarative programming: specifying WHAT should be done.

		// 2.1 Using an anonymous inner class to implement Consumer<Integer>.
		// An anonymous inner class allows us to create a one-time use class without
		// naming it. We implement the accept method to define the action.
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer integer) {
				System.out.println(integer);
			}
		});

		// 2.2 Using a lambda expression with explicit parameter type.
		// Lambda expressions provide a concise way to represent anonymous functions.
		// Syntax: (parameters) -> { body }
		list.forEach((Integer integer) -> {
			System.out.println(integer);
		});

		// 2.3 Using a lambda expression with inferred parameter type.
		// The compiler can infer the parameter type from the context, so we can omit it.
		list.forEach(integer -> {
			System.out.println(integer);
		});

		// 2.4 Simplifying the lambda expression to a single-line statement.
		// If the lambda body contains only one statement, braces can be omitted.
		list.forEach(integer -> System.out.println(integer));

		// 2.5 Using a method reference for even more concise code.
		// Method references are shorthand for lambda expressions that call a method.
		// Syntax: ClassName::methodName or objectReference::methodName
		list.forEach(System.out::println);
	}

}
