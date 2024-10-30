package part_03._05_Lambda_Expressions_and_Functional_Interfaces._4_Lambda_Expressions;

/// Lambda expressions are a way to implement functional interfaces in a concise and readable way.
/// They allow us to define behavior (a method implementation) inline and pass it as an argument.
public class LambdasDemo {

	public static void show() {
		// #1. Full version of a lambda expression:
		// In this lambda expression, the parameter type (String) is explicitly declared.
		// The body of the lambda uses curly braces and contains one or more statements.
		greet((String message) -> {
			System.out.println(message);
		});

		// #2. Simplified version of a lambda expression:
		// Here, the parameter type is inferred from the context, so there's no need to
		// explicitly declare it.
		// Additionally, since there is only a single expression, curly braces and return
		// statements are not needed.
		greet(message -> System.out.println(message));

		// #4. Storing a lambda expression in a variable:
		// A lambda expression can be assigned to a variable that is compatible with the
		// functional interface type.
		// Here, the lambda is stored in a variable of type Printer, which matches the
		// functional interface.
		Printer printer = message -> System.out.println(message);
	}

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

}
