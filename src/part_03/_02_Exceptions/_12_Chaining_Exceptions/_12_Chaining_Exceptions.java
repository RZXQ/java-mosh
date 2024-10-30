package part_03._02_Exceptions._12_Chaining_Exceptions;

public class _12_Chaining_Exceptions {

	public static void main(String[] args) {
		Account account = new Account();

		try {
			account.withdraw(10);
		}
		catch (AccountException e) {
			System.out.println(e.getCause().getMessage());
			e.printStackTrace();
		}

	}

}
