package part_02._04_Inheritance._7_Upcasting_and_Downcasting;

public class UIControl {

	private boolean isEnabled;

	public UIControl(boolean isEnabled) {
		this.isEnabled = isEnabled;
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