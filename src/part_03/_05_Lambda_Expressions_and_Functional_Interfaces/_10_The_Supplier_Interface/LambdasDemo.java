package part_03._05_Lambda_Expressions_and_Functional_Interfaces._10_The_Supplier_Interface;

import java.util.function.Supplier;

/// Demonstration of the Supplier interface and its usage in Java.
///
/// 1. Supplier Interface:
///    - Interface: Supplier<T>
///    - Method: T get()
///    - Purpose: Represents a supplier of results.
///
/// 2. IntSupplier Interface (and other primitive variants):
///    - Interface: IntSupplier
///    - Method: int getAsInt()
///    - Purpose: Represents a supplier of int-valued results.
///      Used to avoid autoboxing overhead when dealing with primitives.
///    - Similar interfaces: LongSupplier, DoubleSupplier, etc.
///
/// Let's keep this super simple:
/// A Supplier is like a "function" that doesn't take any input but gives you some
/// result when you ask for it. In this example, the Supplier is like a "random
/// number vending machine".
///
/// Normally, you could just write `Math.random()` directly to get a random number.
/// But by using a Supplier, you create a separate "box" that can generate random
/// numbers whenever you need.
///
/// Imagine you have different places in your code where you want random numbers.
/// Instead of writing `Math.random()` in all those places, you create a Supplier
/// once, and just call it every time you need a number.
///
/// The cool part is that you only get the random number when you actually ask for
/// it, by calling `get()`. You don't have to generate the number right away.
///
/// Also, when you're testing code, instead of generating random numbers (which are
/// unpredictable), you could make the Supplier give you a fixed number. This makes
/// testing easier and more predictable.
public class LambdasDemo {

	public static void show() {
		// Using Supplier to generate random numbers

		// Option 1: Using an anonymous inner class
		Supplier<Double> getRandom1 = new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
		};

		// Option 2: Using a lambda expression
		Supplier<Double> getRandom2 = () -> Math.random();

		// Option 3: Using a method reference
		Supplier<Double> getRandom3 = Math::random;

		// Up to this point, Math.random() has not been called.
		// The Suppliers are defined but not executed (lazy evaluation).

		// Now, get the random numbers by calling get()
		double random1 = getRandom1.get(); // Math.random() is called here
		double random2 = getRandom2.get(); // Math.random() is called here
		double random3 = getRandom3.get(); // Math.random() is called here

		System.out.println("Random number from anonymous inner class: " + random1);
		System.out.println("Random number from lambda expression: " + random2);
		System.out.println("Random number from method reference: " + random3);
	}

}
