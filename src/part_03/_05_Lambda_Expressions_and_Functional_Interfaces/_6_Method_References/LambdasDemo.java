package part_03._05_Lambda_Expressions_and_Functional_Interfaces._6_Method_References;

// A. This class demonstrates method references in Java.
// Method references are a shorthand notation for certain types of lambda
// expressions. They allow us to refer to methods or constructors without
// executing them. Method references are used to create instances of
// functional interfaces by referencing existing methods.

// B. Signature Matching: The critical part is that the method signatures
// (parameter types and return type) are compatible. The method we reference
// must have a signature that matches the abstract method in the functional
// interface.

// C. Implementing the print Method:
// When we use the greet method:
//
// public static void greet(Printer printer) {
//     printer.print("Hello World");
// }
// We need to pass an object that implements the Printer interface, i.e.,
// provides an implementation for the print method.

// D. Using Method References as Implementations
// Method references are used to provide this implementation in a concise way.
// The methods we reference must have a signature that matches the print
// method in the Printer interface:
// 1. Parameter Types: Must accept a single String parameter.
// 2. Return Type: Must return void.
// Notice: We are not referencing the print method in the Printer interface.
// Instead, we are referencing other methods that can serve as implementations
// for print.
public class LambdasDemo {

	// Default constructor
	public LambdasDemo() {
	}

	// Constructor that takes a String parameter
	public LambdasDemo(String message) {
		System.out.println("Constructor called with message: " + message);
	}

	// Static method for method reference
	public static void printStatic(String message) {
		System.out.println("Static method printStatic: " + message);
	}

	public static void show() {
		// 0. Using an anonymous inner class
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println("Anonymous inner class: " + message);
			}
		});

		// 1. Using a lambda expression
		greet(message -> System.out.println("Lambda expression: " + message));
		// Equivalent method reference to an instance method (println)
		// System.out::println is a method reference to the println method of PrintStream
		greet(System.out::println);

		// 2. Using a lambda expression to call a static method
		greet(message -> LambdasDemo.printStatic(message));
		// Equivalent method reference to a static method
		greet(LambdasDemo::printStatic);

		// 3. Using a lambda expression to call an instance method
		var demo = new LambdasDemo();
		greet(message -> demo.printInstance(message));
		// Equivalent method reference to an instance method
		greet(demo::printInstance);

		// 4. Using a lambda expression to call a constructor
		greet(message -> new LambdasDemo(message));
		// Equivalent method reference to a constructor
		greet(LambdasDemo::new);
	}

	// The greet method accepts a Printer functional interface
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	// Instance method for method reference
	public void printInstance(String message) {
		System.out.println("Instance method printInstance: " + message);
	}

}
