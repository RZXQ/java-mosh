package part_03._02_Exceptions._6_Catching_Multiple_Types_of_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

	public static void show() {
		try {
			var reader = new FileReader("file.txt");
			var read = reader.read();
			new SimpleDateFormat().parse("");
		}
		catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}
		// the syntax catch (IOException | ParseException e) uses a multi-catch block,
		// introduced in Java 7, to handle more than one type of exception with a single
		// catch block. The vertical bar | essentially works like a logical "or," and it
		// means the catch block will execute if either IOException or ParseException is
		// thrown.
		catch (IOException | ParseException e) {
			System.out.println("Could not read data.");
		}
	}

}
