package part_01._03_Control_Flow._04_If_Statements;

public class _04_If_Statements {

	public static void main(String[] args) {
		int temp = 32;
		if (temp > 30) {
			System.out.println("It's a hot day");
			System.out.println("Drink water");
		}
		else if (temp >= 20 && temp <= 30) {
			System.out.println("It's a nice day");
		}
		else {
			System.out.println("It's cold");
		}
	}

}
