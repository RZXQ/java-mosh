package part_03._02_Exceptions._7_The_finally_Block;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {

	public static void show() {
		FileReader reader = null;
		try {
			reader = new FileReader("file.txt");
			var value = reader.read(); // If this line throws an exception, the subsequent
										// line will not release the resource, potentially
										// causing issues
			reader.close();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
		finally { // the finally block would always get executed no matter what
			if (reader != null) {
				try {
					reader.close();
				}
				catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

}
