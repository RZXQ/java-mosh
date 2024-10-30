package part_01._05_Debugging_and_Deploying_Applications._04_Debugging_Java_Applications;

public class _04_Debugging_Java_Applications {

	public static void main(String[] args) {
		System.out.println("Start");
		printNumbers(4);
		System.out.println("Finish");
	}

	private static void printNumbers(int limit) {
		for (int i = 0; i <= limit; i += 2) {
			System.out.println(i);
		}
	}

}
