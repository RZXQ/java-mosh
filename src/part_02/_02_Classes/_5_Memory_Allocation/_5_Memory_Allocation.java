package part_02._02_Classes._5_Memory_Allocation;

import part_02._02_Classes._3_Creating_Classes.TextBox;

public class _5_Memory_Allocation {

	public static void main(String[] args) {
		TextBox textBox1 = new TextBox();
		TextBox textBox2 = new TextBox();

		textBox2.setText("Hello World");
		System.out.println(textBox1.text);
	}

}
