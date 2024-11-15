package part_03._05_Lambda_Expressions_and_Functional_Interfaces._2_Functional_Interfaces;

// This class demonstrates the use of anonymous inner classes and functional interfaces
public class LambdasDemo {

	public static void show() {
		// A. Use a concrete class implementation of Printer
		// We create an instance of ConsolePrinter, which implements the Printer
		// interface, and pass it to the greet method
		greet(new ConsolePrinter());

		// B. Use an anonymous inner class to implement Printer
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		});
	}

	// The greet method accepts a Printer object
	// We don't care about the specific implementation; we're programming to the interface
	// This promotes flexibility and allows us to pass any object that implements Printer
	// The method is static so it can be called without creating an instance of
	// LambdasDemo
	public static void greet(Printer printer) {
		// Calls the print method of the Printer interface
		printer.print("Hello World");
	}

}
