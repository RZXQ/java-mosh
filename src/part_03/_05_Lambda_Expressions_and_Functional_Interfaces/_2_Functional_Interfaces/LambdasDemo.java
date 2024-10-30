package part_03._05_Lambda_Expressions_and_Functional_Interfaces._2_Functional_Interfaces;

/// This class demonstrates the use of anonymous inner classes.
///
/// An anonymous inner class is a class without a name that is used for one-time
/// implementations of an interface or class. It allows us to instantiate and
/// define the behavior in the same place where we need the instance.
///
/// In this example, we use an anonymous inner class to implement the Printer
/// interface inside the method call, without needing to define a separate named class.
public class LambdasDemo {

	// anonymous inner class:
	public static void show() {
		// We define the implementation of the Printer interface directly inside the
		// method using an anonymous inner class. Since we don't need to reuse this
		// implementation, it's practical to define it inline for one-time use.
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		});
	}

	public static void greet(Printer printer) {
		// Calls the print method of the Printer interface, implemented in the anonymous inner class.
		printer.print("Hello World");
	}

}