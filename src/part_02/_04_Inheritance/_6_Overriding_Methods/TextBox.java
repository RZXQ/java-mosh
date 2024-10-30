package part_02._04_Inheritance._6_Overriding_Methods;

public class TextBox extends UIControl {

	private String text = "";

	public TextBox() {
		super(false);
		System.out.println("TextBox");
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void clear() {
		text = "";
	}

	
	/// The @Override annotation helps the compiler detect errors. If the method does not correctly override a method in the superclass (e.g., due to a typo in the method name or a mismatch in the parameter list), the compiler will produce an error. This is particularly useful to catch subtle mistakes that can lead to bugs.
	@Override
	public String toString() {
		return "TextBox{" + "text='" + text + '\'' + '}';
	}

}
