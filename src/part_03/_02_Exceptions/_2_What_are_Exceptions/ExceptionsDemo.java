package part_03._02_Exceptions._2_What_are_Exceptions;

public class ExceptionsDemo {

	public static void show() {
		// This will throw a NullPointerException because the argument is null,
		// demonstrating exception handling
		sayHello(null);
	}

	public static void sayHello(String name) {
		System.out.println(name.toUpperCase());
	}

}
