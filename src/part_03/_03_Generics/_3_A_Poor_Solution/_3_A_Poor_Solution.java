package part_03._03_Generics._3_A_Poor_Solution;

/**
 * This class shows a poor solution to type safety in Java by using a non-generic List
 * class. It highlights the problems with raw types and illustrates the need for generics.
 */
public class _3_A_Poor_Solution {

	public static void main(String[] args) {
		var list = new List();

		// 1. Adding different types of objects to the list
		// - Since this List class uses Object, it can accept any type.
		list.add(1); // Integer, through autoboxing Integer.valueOf(1)
		list.add("1"); // String
		list.add(new User()); // User object

		// 2. Retrieving and casting objects from the list
		// - Since the List class returns Object, we need to cast to the expected type.
		// - Issue 1: Verbose and noisy due to explicit casting.
		int number = (int) list.get(0); // Casting to int (works fine here)

		// Issue 2: Runtime type safety issue, leading to ClassCastException.
		// - Here, we wrongly assume the object is an Integer.
		// - This will cause a runtime exception because the actual object is a String.
		int number2 = (int) list.get(1);

		// 3. Highlighting the limitations:
		// - Runtime type errors: Problems only identified at runtime, not compile time.
		// - Generics solve this problem by providing compile-time type checking.
		// - With generics, we can catch such problems at compile time, ensuring
		// more robust and type-safe code.
	}

}