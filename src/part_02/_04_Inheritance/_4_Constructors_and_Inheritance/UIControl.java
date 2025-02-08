package part_02._04_Inheritance._4_Constructors_and_Inheritance;

public class UIControl {

	private boolean isEnabled;

	/*
	 * ===============================================================================
	 * Default Constructor (Parent)
	 * ===============================================================================
	 */
	public UIControl() {
		System.out.println("Parent Class: UIControl + 0 Parameter");
	}

	/*
	 * ===============================================================================
	 * Parameterized Constructor (Parent)
	 * ===============================================================================
	 */
	public UIControl(boolean isEnabled) {
		this.isEnabled = isEnabled;
		System.out.println("Parent Class: UIControl + 1 Parameter");
	}

}
