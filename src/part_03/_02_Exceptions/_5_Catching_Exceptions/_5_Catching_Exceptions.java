package part_03._02_Exceptions._5_Catching_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _5_Catching_Exceptions {

	public static void main(String[] args) {
		try {
			var reader = new FileReader("file.txt");
			System.out.println("This line won't be executed if exception occurred");
		}
		catch (FileNotFoundException ex) {
			// getMessage()
			System.out.println(ex.getMessage());
			// printStackTrace()
			ex.printStackTrace();
		}
		System.out.println("This line can still be executed");
	}

}
