package part_03._05_Lambda_Expressions_and_Functional_Interfaces._8_The_Consumer_Interface;

import java.util.List;

/// 1. Consumer Interface:
///    - Interface Consumer<T>:
///      - Method: void accept(T t)
///      - Purpose: Represents an operation that takes a single argument and does not return a value.
/// 2. BIConsumer Interface:
///    - Interface BIConsumer<T, U>:
///      - Method: void accept(T t, U u)
///      - Purpose: Represents an operation that takes two arguments and does not return a value.
/// 3. IntConsumer Interface:
///    - Method: void accept(int value)
///    - Purpose: Represents an operation that takes a single int argument and does not return a value.
///    - Similar interfaces: LongConsumer, DoubleConsumer, etc.
/// 4. Method Referencing and Functional Interfaces:
///    - To successfully use a method reference, the referenced method must be compatible with the
///      functional interface’s abstract method in terms of:
///      - Number and types of parameters
///      - Return type
public class LambdasDemo {

	public static void show() {
		List<Integer> list = List.of(1, 2, 3);

		// Method one (Imperative programming): Iterate the list using a for-each loop
		for (var item : list) {
			System.out.println(item);
		}

		// Method two (Declarative programming): Iterate the list using a lambda
		// expression
		list.forEach(integer -> System.out.println(integer));

		// Method three (Declarative programming): Iterate the list using a method
		// reference
		list.forEach(System.out::println);
	}

}