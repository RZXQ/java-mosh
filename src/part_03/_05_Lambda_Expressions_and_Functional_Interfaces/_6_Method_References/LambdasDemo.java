package part_03._05_Lambda_Expressions_and_Functional_Interfaces._6_Method_References;

/// Method referencing: format: Class/Object::method
///
/// When using method references (like LambdasDemo::print1), Java matches the parameter list and method signature of the referenced method to the method in the functional interface. In this case, the method name of the referenced method (e.g., print1) doesn’t need to match the method name in the functional interface (e.g., print). Only the parameter types and order must match.
///
/// So while the method signature technically includes the method name, in the context of method references, Java only requires the parameters to match between the functional interface and the referenced method, ignoring the method names.
///
/// To summarize:
///
/// - Method signature in Java includes the method name and parameter list.
/// - For method references, only the parameter list matters, and the method name can differ between the referenced method and the functional interface.
public class LambdasDemo {

	public LambdasDemo() {
	}

	public LambdasDemo(String message) {
	}

	public static void print1(String message) {
	}

	public static void show() {
		// 1. method reference to lambda expression
		greet(message -> System.out.println(message));
		greet(System.out::println);

		// 2. method reference to static method
		greet(LambdasDemo::print1);

		// 3. method reference to instance method
		var demo = new LambdasDemo();
		greet(demo::print2);

		// 4. method reference to constructor method
		greet(LambdasDemo::new);
	}

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	public void print2(String message) {
	}

}