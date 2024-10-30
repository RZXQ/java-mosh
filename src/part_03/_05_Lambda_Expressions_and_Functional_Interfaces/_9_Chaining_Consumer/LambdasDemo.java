package part_03._05_Lambda_Expressions_and_Functional_Interfaces._9_Chaining_Consumer;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {

	// Main method to demonstrate chaining of Consumers with lambda expressions
	public static void show() {
		// Creating an immutable list of strings containing "a", "b", and "c"
		List<String> list = List.of("a", "b", "c");

		// Defining a Consumer to print the item
		Consumer<String> print = item -> System.out.println(item);

		// Defining another Consumer to print the item in uppercase
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

		// Chaining Consumers using `andThen()`:
		// This will first print the item, then print the item in uppercase,
		// and finally print the item again.
		list.forEach(print.andThen(printUpperCase).andThen(print));
	}

}