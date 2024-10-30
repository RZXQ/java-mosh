package part_03._05_Lambda_Expressions_and_Functional_Interfaces._2_Functional_Interfaces;

public class ConsolePrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
