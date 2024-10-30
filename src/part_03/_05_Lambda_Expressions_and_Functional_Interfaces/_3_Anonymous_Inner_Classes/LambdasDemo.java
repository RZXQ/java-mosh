package part_03._05_Lambda_Expressions_and_Functional_Interfaces._3_Anonymous_Inner_Classes;

public class LambdasDemo {

	public static void show() {
		// Using an anonymous inner class to implement the Printer interface
		// This is useful for one-time use without needing a separate class
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		});
	}

	public static void greet(Printer printer) {
		// Print the greeting message using the provided Printer implementation
		printer.print("Hello World");
	}

}