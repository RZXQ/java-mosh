package part_03._05_Lambda_Expressions_and_Functional_Interfaces._11_The_Function_Interface;

import java.util.function.Function;

/// This example demonstrates the use of the Function interface in Java.
/// Think of a Function interface as a way to perform a particular action on an input to get an output.
/// - In simple words, it takes an input of one type (T) and gives an output of another type (R).
///
/// We often use it for various transformations or computations:
/// 1. **Modularity**: You can write code that is easier to manage and understand by splitting logic into smaller parts.
/// 2. **Reusability**: Define the function once and reuse it wherever you need to perform the same action.
/// 3. **Separation of Concerns**: Keep the logic (what to do) separate from its usage (where to do it).
/// 4. **Functional Programming**: Java allows writing code in a functional style, making it easier to work with transformations.
///
/// Let's see a simple example where we map a String to its length (an Integer).
public class _11_The_Function_Interface {

	public static void main(String[] args) {
		/// Creates a Function that converts a String to its Integer length
		/// In simpler terms, we are defining a rule that takes a String and gives its
		/// length.
		Function<String, Integer> map = str -> str.length();

		/// Applies the function to the string "Sky"
		var length = map.apply("Sky");

		/// Prints the length of the string "Sky"
		System.out.println(length);
	}

}