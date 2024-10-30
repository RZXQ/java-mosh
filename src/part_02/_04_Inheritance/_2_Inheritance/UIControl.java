package part_02._04_Inheritance._2_Inheritance;

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
