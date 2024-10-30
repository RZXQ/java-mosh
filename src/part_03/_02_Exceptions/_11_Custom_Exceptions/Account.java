package part_03._02_Exceptions._11_Custom_Exceptions;

import java.io.IOException;

public class Account {

	private float balance;

	public void deposit(float value) throws IOException {
		if (value <= 0) {
			throw new IOException();
		}
	}

	public void withdraw(float value) throws InsufficientFundsException {
		if (value > balance) {
			throw new InsufficientFundsException();
		}
	}

}
