package part_02._04_Inheritance._5_Access_Modifiers;

public class UIControl {
	
	// 'protected' means:
	// - Accessible within the same package (like default/package-private).
	// - Accessible by subclasses even if they are in different packages.
	
	// 'default' (or package-private) means:
	// - Accessible within the same package.
	// - Not accessible from outside the package.
	
	protected boolean isEnabled;
	
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