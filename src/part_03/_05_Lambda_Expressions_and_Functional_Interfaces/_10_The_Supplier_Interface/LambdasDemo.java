/// Let's keep this super simple:
/// A **Supplier** is like a "function" that doesn't take any input but gives you some result when you ask for it.
/// In this example, the Supplier is like a "random number vending machine".
///
/// Normally, you could just write `Math.random()` directly to get a random number. 
/// But by using a Supplier, you create a separate "box" that can generate random numbers whenever you need.
///
/// Imagine you have different places in your code where you want random numbers. 
/// Instead of writing `Math.random()` in all those places, you create a **Supplier** once, and just call it every time you need a number.
///
/// The **cool part** is that you only get the random number when you actually ask for it, by calling `get()`. 
/// You don't have to generate the number right away.
///
/// Also, when you're testing code, instead of generating random numbers (which are unpredictable),
/// you could make the Supplier give you a fixed number. This makes testing easier and more predictable.
package part_03._05_Lambda_Expressions_and_Functional_Interfaces._10_The_Supplier_Interface;

import java.util.function.Supplier;

public class LambdasDemo {

	public static void show() {
		/// Creates a Supplier that generates a random double value
		Supplier<Double> getRandom = () -> Math.random();
		/// Retrieves the random double value by calling the get method of the Supplier
		var random = getRandom.get();
		/// Prints the random double value to the console
		System.out.println(random);
	}

}
