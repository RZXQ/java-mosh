package part_03._05_Lambda_Expressions_and_Functional_Interfaces._5_Variable_Capture;

// This class demonstrates variable capture in lambda expressions and anonymous inner classes.
// Variable capture refers to the ability of a lambda expression or inner class to access variables
// from its enclosing scope (method or class).
public class LambdasDemo {

	// Static field in the enclosing class
	public static String prefix2 = "-";

	// Instance field in the enclosing class
	public String prefix3 = "-";

	// Instance method to demonstrate variable capture

	// Static method that accepts a Printer functional interface
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	public void show() {
		// 1. Lambda expressions can access local variables in the enclosing method.
		String prefix1 = "-";
		greet(message -> System.out.println(prefix1 + message));

		// 2. Lambda expressions can access static fields in the enclosing class.
		greet(message -> System.out.println(prefix2 + message));

		// 3. Lambda expressions can access instance fields in the enclosing class.
		greet(message -> System.out.println(prefix3 + message));

		// 4. In lambda expressions, 'this' refers to the instance of the enclosing class
		// (LambdasDemo).
		greet(message -> System.out.println(this));

		// 5. 'this'
		// - In anonymous inner classes, 'this' refers to the instance of the anonymous
		// inner class.
		// - Anonymous inner classes can have their own state (instance variables).
		greet(new Printer() {
			// Anonymous inner class can have instance variables (state).
			private String name;

			@Override
			public void print(String message) {
				// 'this' refers to the anonymous inner class instance.
				System.out.println(this);
			}
		});
	}

}
