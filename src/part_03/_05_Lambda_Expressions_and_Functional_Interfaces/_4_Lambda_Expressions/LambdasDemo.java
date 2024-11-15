package part_03._05_Lambda_Expressions_and_Functional_Interfaces._4_Lambda_Expressions;

// Lambda expressions provide a concise way to implement functional interfaces.
// They allow us to define behavior inline and pass it as an argument.
public class LambdasDemo {

	public static void show() {
		// #1. Full version of a lambda expression:
		// - Parameter type (String) is explicitly declared.
		// - Parameters are enclosed in parentheses.
		// - The body uses curly braces and can contain multiple statements.
		// - Useful when the lambda body has more than one statement.
		greet((String message) -> {
			System.out.println(message);
		});

		// #2. Simplified version of a lambda expression:
		// - Parameter type is inferred from context; no need to declare it.
		// - Parentheses are optional for single parameters.
		// - Curly braces can be omitted for single statements.
		// - The expression result is automatically returned if needed.
		greet(message -> System.out.println(message));

		// #3. Storing a lambda expression in a variable:
		// - Lambda expressions can be assigned to variables.
		// - The variable type must be a functional interface compatible with the lambda.
		// - Allows reusing the lambda expression in multiple places.
		// - lambda expression is essentially an object
		Printer printer = message -> System.out.println(message);

		// Use the printer variable wherever a Printer is required.
		printer.print("Hello from stored lambda!");

		// #4. Lambda expression with multiple statements in the body:
		// - Curly braces are required when the body has multiple statements.
		// - Use the 'return' keyword if the method has a return type.
		Printer multiLinePrinter = message -> {
			System.out.println("Printing message:");
			System.out.println(message);
		};

		multiLinePrinter.print("Hello from multi-line lambda!");
	}

	// The greet method accepts a Printer object.
	// This demonstrates programming to an interface, allowing for flexibility.

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

}
