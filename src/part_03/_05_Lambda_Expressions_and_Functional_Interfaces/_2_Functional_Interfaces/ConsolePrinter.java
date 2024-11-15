package part_03._05_Lambda_Expressions_and_Functional_Interfaces._2_Functional_Interfaces;

// This class provides a concrete implementation of the Printer interface
// It prints messages to the console
public class ConsolePrinter implements Printer {

	// Implement the abstract method from the Printer interface
	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
