package part_02._04_Inheritance._4_Constructors_and_Inheritance;

/// Constructor:
/// 1. Initialization: First, the parent's constructor is initialized, then the child's constructor is initialized.
///    This is because a child class cannot exist without the parent class being initialized first.
/// 2. By default, the child's constructor will call the parent's default (empty) constructor.
///    However, if the parent class has a customized constructor, then you need to explicitly call this constructor from the child class.

public class _4_Constructors_and_Inheritance {

	public static void main(String[] args) {
		TextBox textBox = new TextBox();
	}

}