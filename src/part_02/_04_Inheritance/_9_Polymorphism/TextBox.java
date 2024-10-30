package part_02._04_Inheritance._9_Polymorphism;

public class TextBox extends UIControl {

	String label = "TextBox Label";

	// override shortcut: ctrl + o
	@Override
	public void render() {
		System.out.println("Render TextBox");
	}

}
