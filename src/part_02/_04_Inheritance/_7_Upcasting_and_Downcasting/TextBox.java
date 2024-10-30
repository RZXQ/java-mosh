package part_02._04_Inheritance._7_Upcasting_and_Downcasting;

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

	@Override
	public String toString() {
		return "TextBox{" + "text='" + text + '\'' + '}';
	}

}
