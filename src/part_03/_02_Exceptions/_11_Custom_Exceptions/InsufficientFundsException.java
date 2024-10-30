package part_03._02_Exceptions._11_Custom_Exceptions;

// Checked -> extends Exception class
// Unchecked(runtime) -> extends RuntimeException class
public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
		super("Insufficient funds in your account.");
	}

	public InsufficientFundsException(String message) {
		super(message);
	}

}
