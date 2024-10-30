package part_03._02_Exceptions._12_Chaining_Exceptions;

public class AccountException extends Exception {

	public AccountException(Exception cause) {
		super(cause);
	}

}
