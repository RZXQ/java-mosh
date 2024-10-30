package part_02._02_Classes._4_Creating_Objects;

import part_02._02_Classes._3_Creating_Classes.TextBox;

public class _4_Creating_Objects {

	public static void main(String[] args) {
		TextBox textBox1 = new TextBox();
		// System.out.println(textBox1.text.toUpperCase()); // NullPointerException

		TextBox textBox2 = new TextBox();
		textBox2.setText("Box 2");
		System.out.println(textBox2.text);
	}

}
