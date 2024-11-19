package part_03._05_Lambda_Expressions_and_Functional_Interfaces._9_Chaining_Consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 * Demonstrates chaining of Consumers to perform multiple operations sequentially. The
 * Consumer interface provides a default method: Consumer<T> andThen(Consumer<? super T>
 * after)
 */
public class LambdasDemo {

	public static void show() {
		// Initialize a list of strings
		List<String> list = List.of("a", "b", "c");

		// Operation 1: Print each string (using a method reference)
		Consumer<String> print = System.out::print;

		// Operation 2: Print each string in uppercase (using a lambda expression)
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

		// Chain the consumers: execute print, then printUpperCase for each item
		list.forEach(print.andThen(printUpperCase));

		// Expected output:
		// aA
		// bB
		// cC
	}

}
