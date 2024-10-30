package part_02._04_Inheritance._7_Upcasting_and_Downcasting;

// Upcasting: Converting an object to one of its super types
// Downcasting: Converting an object back to one of its sub types
public class _7_Upcasting_and_Downcasting {

	public static void main(String[] args) {
		UIControl control = new TextBox();
		show(control);
		// Upcasting: The TextBox object is treated as an UIControl object.
		// This works because TextBox is a subclass of UIControl (TextBox IS-A UIControl).
		TextBox textBox = new TextBox();
		show(textBox);

	}

	public static void show(UIControl control) {
		// Downcasting: Converting control from UIControl back to TextBox.
		// Without downcasting, we can only access methods available in UIControl.
		if (control instanceof TextBox) { // Checking if control is actually a TextBox
											// instance
			TextBox textBox = (TextBox) control;
			textBox.setText("Hello World"); // Now we can use methods specific to TextBox
		}
		System.out.println(control);
	}

}