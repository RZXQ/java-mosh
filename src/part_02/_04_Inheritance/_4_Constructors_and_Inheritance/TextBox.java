package part_02._04_Inheritance._4_Constructors_and_Inheritance;

public class TextBox extends UIControl {

	private String text = "";

	public TextBox() {
		super(false); // call the constructor in parent class
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

}
