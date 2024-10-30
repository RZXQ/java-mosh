package part_03._05_Lambda_Expressions_and_Functional_Interfaces._5_Variable_Capture;

public class LambdasDemo {

	public static String prefix1 = "-";

	public String prefix2 = "-";

	public static void greet(Printer printer) {
		printer.print("Hello World");
	}

	public void show() {
		greet(message -> System.out.println(prefix1 + message));

		greet(message -> System.out.println(prefix2 + message));

		// this keyword represents the current instance of LambdasDemo class
		greet(message -> System.out.println(this.prefix2));

		String prefix3 = "-";
		greet(message -> System.out.println(prefix3 + message));
	}

}