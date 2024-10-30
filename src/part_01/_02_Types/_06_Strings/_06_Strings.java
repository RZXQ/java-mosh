package part_01._02_Types._06_Strings;

public class _06_Strings {

	public static void main(String[] args) {
		// Initialize string
		String message = "  Hello World" + "!!  ";
		System.out.println(message);

		// Check start and end
		System.out.println(message.startsWith("!!"));
		System.out.println(message.endsWith("!!"));

		// Length and index
		System.out.println(message.length());
		System.out.println(message.indexOf("sky"));

		// String replacement
		System.out.println(message.replace("!", "*"));

		// String immutability and transformations
		System.out.println(message); // Original string
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}