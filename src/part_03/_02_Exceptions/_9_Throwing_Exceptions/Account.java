package part_03._02_Exceptions._9_Throwing_Exceptions;

import java.io.IOException;

public class Account {

	public void deposit(float value) throws IOException {
		// This method demonstrates defensive programming by validating input.
		// Key points:
		// - Defensive programming involves anticipating and handling potential errors
		// early.
		// - Validate method arguments to prevent improper use of the method.
		// - Use appropriate exceptions to indicate the type of error encountered.

		if (value <= 0) {
			// Throw an IllegalArgumentException if the deposit amount is zero or
			// negative.
			throw new IOException();
		}

		// Proceed with deposit operation...
	}

}
