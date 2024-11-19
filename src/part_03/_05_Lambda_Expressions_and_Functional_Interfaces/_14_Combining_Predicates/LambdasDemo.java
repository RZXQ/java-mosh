package part_03._05_Lambda_Expressions_and_Functional_Interfaces._14_Combining_Predicates;

import java.util.function.Predicate;

/// Demonstration of combining predicates and their usage in Java.
///
/// 1. Predicate Interface:
///    - Interface: Predicate<T>
///    - Method: boolean test(T t)
///    - Purpose: Represents a condition or test on an input.
///
/// 2. Combining Predicates:
///    - and(Predicate other):
///      - Combines this predicate with another using logical AND.
///    - or(Predicate other):
///      - Combines this predicate with another using logical OR.
///    - negate():
///      - Returns a predicate that represents the logical negation of this predicate.
public class LambdasDemo {

	public static void show() {
		// Creating predicates to test specific conditions
		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		Predicate<String> hasRightBrace = str -> str.endsWith("}");

		// 1. Combining predicates using AND
		// This checks if a string starts with '{' AND ends with '}'.
		System.out.println("AND: " + hasLeftBrace.and(hasRightBrace).test("{key:value}"));

		// 2. Combining predicates using OR
		// This checks if a string starts with '{' OR ends with '}'.
		System.out.println("OR: " + hasLeftBrace.or(hasRightBrace).test("{key:value"));

		// 3. Negating a predicate
		// This checks if a string does NOT start with '{'.
		System.out.println("Negate: " + hasLeftBrace.negate().test("key:value}"));
	}

}