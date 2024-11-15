package part_03._05_Lambda_Expressions_and_Functional_Interfaces._3_Anonymous_Inner_Classes;

// Demonstrates anonymous inner classes and lambda expressions as alternatives to named classes
public class LambdasDemo {

	public static void show() {
		// A. Using a concrete class implementation of Printer
		// ConsolePrinter is a named class that implements Printer
		greet(new ConsolePrinter());

		// B. Using an anonymous inner class to implement Printer
		// - Anonymous because it has no name
		// - Inner class because it's defined within another class
		// Allows defining custom behavior without creating a separate class
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		});

		// C. Using a lambda expression to implement Printer
		// Since Printer is a functional interface (one abstract method),
		// we can use a lambda expression for a more concise implementation
		greet(message -> System.out.println(message));
	}

	// The greet method accepts a Printer object
	// Programming to the interface allows flexibility in implementations
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

}
