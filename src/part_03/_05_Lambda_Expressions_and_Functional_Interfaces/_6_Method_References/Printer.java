package part_03._05_Lambda_Expressions_and_Functional_Interfaces._6_Method_References;

public interface Printer {

	void print(String message);

	default void printTwice(String message) {
		System.out.println(message);
		System.out.println(message);
	}

}