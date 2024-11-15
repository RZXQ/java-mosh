package part_03._05_Lambda_Expressions_and_Functional_Interfaces._3_Anonymous_Inner_Classes;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
