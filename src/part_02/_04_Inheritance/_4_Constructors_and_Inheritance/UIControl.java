package part_02._04_Inheritance._4_Constructors_and_Inheritance;

public class UIControl {

	private boolean isEnabled;

	public UIControl(boolean isEnabled) {
		this.isEnabled = isEnabled;
		System.out.println("UIControl");
	}

	public void enable() {
		isEnabled = true;
	}

	public void disable() {
		isEnabled = false;
	}

	public boolean isEnabled() {
		return this.isEnabled;
	}

}
