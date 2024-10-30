package part_02._04_Inheritance._3_The_Object_Class;

import java.util.Objects;

public class TextBox extends UIControl {

	private String text = "";

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void clear() {
		text = "";
	}
	
}
