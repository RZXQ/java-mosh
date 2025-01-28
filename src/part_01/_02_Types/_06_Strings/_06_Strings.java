package part_01._02_Types._06_Strings;

public class _06_Strings {

	public static void main(String[] args) {

		/*
		 * ===============================================================================
		 * + (Concatenation)
		 * ===============================================================================
		 */
		String message = "  Hello World" + "!!  ";
		System.out.println(message);

		/*
		 * ===============================================================================
		 * startsWith and endsWith
		 * ===============================================================================
		 */
		System.out.println(message.startsWith("!!"));
		System.out.println(message.endsWith("!!"));

		/*
		 * ===============================================================================
		 * length and indexOf
		 * ===============================================================================
		 */
		System.out.println(message.length());
		System.out.println(message.indexOf("sky"));

		/*
		 * ===============================================================================
		 * replace and replaceAll
		 * ===============================================================================
		 */
		System.out.println(message.replace("!", "*"));
		System.out.println(message.replaceAll("!", "*"));

		/*
		 * ===============================================================================
		 * toLowerCase, toUpperCase, and trim
		 * ===============================================================================
		 */
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

		/*
		 * ===============================================================================
		 * substring
		 * ===============================================================================
		 */
		System.out.println(message.substring(0, 5));
	}

}
