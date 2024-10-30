package part_02._04_Inheritance._11_Final_Classes_and_Methods;

public abstract class UIControl {

	private boolean isEnabled = true;

	public final void enable() {
		isEnabled = true;
	}

	public abstract void render();

}