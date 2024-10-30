package part_02._02_Classes._3_Creating_Classes;

public class TextBox {

	public String text; // Field

	public void setText(String text) {
		this.text = text; // this is a reference to the current object
	}

	public void clear() {
		this.text = "";
	}

}
