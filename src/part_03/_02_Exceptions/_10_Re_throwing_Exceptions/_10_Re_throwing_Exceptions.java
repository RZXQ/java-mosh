package part_03._02_Exceptions._10_Re_throwing_Exceptions;

import java.io.IOException;

public class _10_Re_throwing_Exceptions {

	public static void main(String[] args) {
		try {
			ExceptionsDemo.show();
		}
		catch (Exception e) {
			System.out.println("An unexpected error occurred.");
		}
	}

}
