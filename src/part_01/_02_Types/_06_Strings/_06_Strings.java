package part_01._02_Types._06_Strings;

public class _06_Strings {

	public static void main(String[] args) {
		// 1. "+ (concatenation)"
		String message = "  Hello World" + "!!  ";
		System.out.println(message);

		// 2. "startsWith" and "endsWith"
		System.out.println(message.startsWith("!!"));
		System.out.println(message.endsWith("!!"));

		// 3. "length" and "indexOf"
		System.out.println(message.length());
		System.out.println(message.indexOf("sky"));

		// 4. "replace" and "replaceAll"
		System.out.println(message.replace("!", "*"));
		System.out.println(message.replaceAll("!", "*"));

		// 5. "toLowerCase", "toUpperCase", "trim"
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

		// 6. "substring"
		System.out.println(message.substring(0, 5));
	}

}