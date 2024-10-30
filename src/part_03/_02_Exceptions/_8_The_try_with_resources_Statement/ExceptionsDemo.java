package part_03._02_Exceptions._8_The_try_with_resources_Statement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {

	public static void show() {
		// This method demonstrates the try-with-resources statement in Java.
		// Key points:
		// - Automatically handles the closing of resources such as FileReader and
		// FileWriter.
		// - Ensures that each resource is closed at the end of the statement.
		// - The Java compiler automatically generates the necessary code for closing
		// resources in a finally block.
		try (var reader = new FileReader("file.txt"); var write = new FileWriter("...");) {
			// Read a value from the file
			var value = reader.read();
		}
		catch (IOException e) {
			// Wrap and rethrow IOException as RuntimeException
			throw new RuntimeException(e);
		}
	}

}