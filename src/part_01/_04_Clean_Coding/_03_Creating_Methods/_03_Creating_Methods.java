package part_01._04_Clean_Coding._03_Creating_Methods;

public class _03_Creating_Methods {

	public static void main(String[] args) {
		String message = greetUser("Ruizhi", "WANG");
		System.out.println(message);
	}

	public static String greetUser(String firstName, String lastName) {
		return "Hello" + firstName + " " + lastName;
	}

}