package part_02._04_Inheritance._9_Polymorphism;

/// Understanding: Poly-morph-ism: Poly: many; morph: form
///
/// Polymorphism allows objects of different classes to be treated as objects of a common super class.
/// It is one of the core concepts of Object-Oriented Programming (OOP).
///
/// Polymorphism happens in two main forms: compile-time (method overloading) and runtime (method overriding).
///
/// 1. **Methods**:
/// In runtime polymorphism, the method that gets executed is determined by the actual object type at runtime,
/// even though the reference is of the parent class type.
/// For example, if a parent class reference points to a child class object, and the child class has overridden
/// a method from the parent class, the child class's method will be invoked.
///
/// 2. **Fields**:
/// Fields are not polymorphic. The field that gets accessed is determined by the reference type, not the object type.
/// Even if a parent class reference points to a child class object, accessing a field will reference the field
/// declared in the parent class, not the child class.
///
public class _9_Polymorphism {

	public static void main(String[] args) {
		// Creating an array of UIControl references, but the actual objects are of
		// TextBox and Checkbox
		UIControl[] controls = { new TextBox(), new CheckBox() };

		for (UIControl control : controls) {
			// 1. For fields:
			// Fields are not polymorphic. The field that gets accessed is determined by
			// the reference type (UIControl).
			// Even though the actual object is of type TextBox or Checkbox, the `label`
			// field accessed here is from the UIControl class.
			System.out.println(control.label); // This will always print "UIControl Label"
												// for both TextBox and Checkbox

			// 2. For methods:
			// Methods are polymorphic. The actual method that gets executed is determined
			// by the object type at runtime.
			// Here, although the reference type is UIControl, the `render` method from
			// TextBox or Checkbox will be invoked if they override the method from
			// UIControl.
			control.render(); // This will print "TextBox Render" for TextBox and
								// "Checkbox Render" for Checkbox
		}
	}

}