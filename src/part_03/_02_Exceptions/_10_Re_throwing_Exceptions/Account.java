package part_03._02_Exceptions._10_Re_throwing_Exceptions;

import java.io.IOException;

public class Account {

	public void deposit(float value) throws IOException {
		if (value <= 0) {
			throw new IOException();
		}
	}

}
