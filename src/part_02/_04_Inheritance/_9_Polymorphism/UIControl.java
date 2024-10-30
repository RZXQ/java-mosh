package part_02._04_Inheritance._9_Polymorphism;

public class UIControl {

	private boolean isEnabled;

	String label = "UIControl Label";

	public void enable() {
		isEnabled = true;
	}

	public void disable() {
		isEnabled = false;
	}

	public boolean isEnabled() {
		return this.isEnabled;
	}
	
	public void render() {

	}

}