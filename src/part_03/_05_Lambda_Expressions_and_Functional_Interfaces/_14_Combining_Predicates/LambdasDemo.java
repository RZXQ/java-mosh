package part_03._05_Lambda_Expressions_and_Functional_Interfaces._14_Combining_Predicates;

import java.util.function.Predicate;

/// In this example, we use Predicates to create conditions and combine them.
///
///    - Sometimes, you need to check multiple conditions together. For example, you might want to check if a string starts and ends with certain characters.
///    - Java provides methods like `and()`, `or()`, and `negate()` to combine simple conditions (Predicates) into more complex ones.
///
/// 2. **and()**: Combines two conditions so that both must be true.
///    - Example: Checking if a string has both a left brace `{` and a right brace `}`.
/// 3. **or()**: Combines two conditions where at least one must be true.
///    - Example: Checking if a string has either a left brace `{` or a right brace `}`.
///
/// 4. **negate()**: Reverses a condition.
///    - Example: Checking if a string does **not** have a left brace `{`.
public class LambdasDemo {

	public static void show() {
		// Predicate to check if a string starts with '{'
		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		// Predicate to check if a string ends with '}'
		Predicate<String> hasRightBrace = str -> str.endsWith("}");

		// Combining two predicates with "and": both conditions must be true.
		Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
		// true because the string starts with '{' and ends with '}'
		var result1 = hasLeftAndRightBrace.test("{key:value}");
		System.out.println(result1); // Output: true

		// Combining two predicates with "or": at least one condition must be true.
		Predicate<String> hasLeftOrRightBrace = hasLeftBrace.or(hasRightBrace);
		// true because the string starts with '{' (even though it also ends with '}')
		var result2 = hasLeftOrRightBrace.test("{key:value}");
		System.out.println(result2); // Output: true

		// Negating a predicate: checks if the condition is false.
		Predicate<String> notHasLeftBrace = hasLeftBrace.negate();
		// false because the string starts with '{'
		var result3 = notHasLeftBrace.test("{key:value}");
		System.out.println(result3); // Output: false
	}

}
