package part_03._05_Lambda_Expressions_and_Functional_Interfaces._2_Functional_Interfaces;

// Functional interface: an interface with exactly one abstract method
// Note: Even though this interface has a default method, it's still considered a functional interface
public interface Printer {

	// Abstract method: no body, just the method signature
	// By default, methods in an interface are public and abstract
	// Implementing classes must provide their own implementation of this method
	void print(String message);

	// Default method: provides a default implementation
	// Default methods are implicitly public
	// They allow us to add new methods to interfaces without breaking existing code
	// Implementing classes can use this method as is or override it
	default void printTwice(String message) {
		System.out.println(message);
		System.out.println(message);
	}

}
