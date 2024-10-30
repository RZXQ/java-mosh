package part_02._04_Inheritance._3_The_Object_Class;

public class UIControl {

	private boolean isEnabled;

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
