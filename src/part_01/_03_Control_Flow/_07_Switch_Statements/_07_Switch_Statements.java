package part_01._03_Control_Flow._07_Switch_Statements;

public class _07_Switch_Statements {

	public static void main(String[] args) {
		String role = "admin";
		switch (role) {
			case "admin":
				System.out.println("You're an admin");
				break;
			case "moderator":
				System.out.println("You're a moderator");
				break;
			default:
				System.out.println("You're a guest");
		}
	}

}
