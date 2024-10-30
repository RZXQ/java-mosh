package part_02._04_Inheritance._6_Overriding_Methods;

/// ### Method Overriding in Java
///
/// Method overriding in Java allows a subclass to provide a specific implementation of a method that is already defined by its superclass. When a method in a subclass has the same name, return type, and parameters as a method in its superclass, the method in the subclass overrides the method in the superclass.
///
/// ### Key Points about Method Overriding
///
/// 1. **Method Name**: The method in the subclass must have the same name as the method in the superclass.
/// 2. **Return Type**: The return type must be the same or a subtype (covariant return type) of the return type declared in the superclass method.
/// 3. **Parameter List**: The parameter list must exactly match the parameter list in the superclass method. This includes:
///    - The number of parameters
///    - The type of each parameter
///    - The order of the parameters
/// 4. **Access Level**: The access level of the overriding method can be less restrictive than the overridden method but cannot be more restrictive. For example:
///    - A `public` method in the superclass can only be overridden by a `public` method.
///    - A `protected` method in the superclass can be overridden by `protected` or `public` methods.
/// 5. **Exceptions**: The overriding method can only throw the same checked exceptions or a subset of them that the overridden method throws. It can also throw any unchecked exceptions.
public class _6_Overriding_Methods {

	public static void main(String[] args) {
		TextBox textBox = new TextBox();
		textBox.setText("Hello World");

		/// Explicitly calling the toString() method is unnecessary because
		/// System.out.println automatically calls toString() on the object.
		System.out.println(textBox.toString());
	}

}
