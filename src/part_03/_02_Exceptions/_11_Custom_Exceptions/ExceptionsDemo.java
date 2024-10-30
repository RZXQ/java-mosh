package part_03._02_Exceptions._11_Custom_Exceptions;

public class ExceptionsDemo {

	public static void show() {

		var account = new Account();
		try {
			account.withdraw(10);
		}
		catch (InsufficientFundsException e) {
			// e.getMessage()
			System.out.println(e.getMessage());
		}
	}

}
