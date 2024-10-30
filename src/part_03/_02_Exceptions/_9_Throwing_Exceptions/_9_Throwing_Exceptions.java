package part_03._02_Exceptions._9_Throwing_Exceptions;

import java.io.IOException;

public class _9_Throwing_Exceptions {

	public static void main(String[] args) {
		var account = new Account();
		try {
			account.deposit(-1);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
