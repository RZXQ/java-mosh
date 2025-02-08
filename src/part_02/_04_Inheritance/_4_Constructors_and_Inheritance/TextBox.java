package part_02._04_Inheritance._4_Constructors_and_Inheritance;

public class TextBox extends UIControl {

	/*
	 * ===============================================================================
	 * Default Constructor (Child)
	 * ===============================================================================
	 */
	public TextBox() {
		System.out.println("Child Class: TextBox + 0 Parameter");
	}

	/*
	 * ===============================================================================
	 * Parameterized Constructor (Child)
	 * ===============================================================================
	 */
	public TextBox(boolean isEnable) {
		super(isEnable);
		System.out.println("Child Class: TextBox + 1 Parameter");
	}

}
