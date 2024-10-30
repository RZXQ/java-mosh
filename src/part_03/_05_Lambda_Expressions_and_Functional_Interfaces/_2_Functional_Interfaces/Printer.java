package part_03._05_Lambda_Expressions_and_Functional_Interfaces._2_Functional_Interfaces;

// Functional Interface: an interface with a single abstract method
// The default keyword in interface: provides a default implementation for a method
public interface Printer {

	// This is a functional interface with one abstract method

	void print(String message);

	// Default method providing a default implementation
	default void printTwice(String message) {
		System.out.println(message);
		System.out.println(message);
	}

}