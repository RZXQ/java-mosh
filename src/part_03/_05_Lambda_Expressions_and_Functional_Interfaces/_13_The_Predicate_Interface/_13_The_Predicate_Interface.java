package part_03._05_Lambda_Expressions_and_Functional_Interfaces._13_The_Predicate_Interface;

import java.util.function.Predicate;

/// We use Predicate to evaluate whether an object satisfies certain criteria, often used for filtering data.
public class _13_The_Predicate_Interface {

	public static void main(String[] args) {
		// Predicate to check if a number is even
		Predicate<Integer> predicate = num -> num % 2 == 0;
		// Output will be false since 11 is not even
		System.out.println(predicate.test(11));

		// Predicate to check if a string's length is greater than 5
		Predicate<String> isLongerThan5 = str -> str.length() > 5;
		// Output will be false since "Sky" has only 3 characters
		System.out.println(isLongerThan5.test("Sky"));
	}

}
