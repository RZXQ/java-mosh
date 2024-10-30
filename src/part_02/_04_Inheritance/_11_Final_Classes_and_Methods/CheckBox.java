package part_02._04_Inheritance._11_Final_Classes_and_Methods;

/*
 This class CheckBox extends UIControl and is declared as 'final'.

 1. Final Class:
    - A final class in Java cannot be extended or subclassed. This means that no other class
      can inherit from CheckBox. This is useful when you want to make sure that your class's
      behavior is not altered by being extended.
    - For example, it ensures that any method implementations inside CheckBox cannot be
      overridden in a subclass.
    - Example Usage: If you try to uncomment the following class declaration, it would
      result in a compile-time error because CheckBox cannot be subclassed.
      
      // class MyCheckBox extends CheckBox {
      //
      // }

 2. Final Methods:
    - A method can be declared as final by using the `final` keyword. This prevents the method
      from being overridden by subclasses.
    - Declaring a method as final ensures that the implementation of the method remains consistent
      and cannot be changed by subclasses.

 */
public final class CheckBox extends UIControl {
	
	@Override
	public void render() {
		System.out.println("Render Checkbox");
	}
	
	/*
     Example of a final method:
     This method cannot be overridden in any subclass.
     */
	public final void someFinalMethod() {
		System.out.println("This is a final method.");
	}
}