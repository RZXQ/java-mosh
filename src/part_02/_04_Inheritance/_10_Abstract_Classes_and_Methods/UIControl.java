package part_02._04_Inheritance._10_Abstract_Classes_and_Methods;

/*
 An abstract class in Java is a class that cannot be instantiated on its own.
 It is meant to be extended by other classes to provide common methods and
 properties which can be shared among all subclasses.

 This class UIControl is declared as abstract partly because it contains an abstract method.
 An abstract method is a method that doesn't have a body; it's just a method signature.
 Any class that extends this abstract class must provide an implementation of this method.
 
 Note: An abstract class does not have to contain an abstract method, but if it does,
 it must be declared abstract.
*/
public abstract class UIControl {

	/*
	 * The abstract method `render()` acts as a placeholder. It forces any non-abstract
	 * subclass of UIControl to provide a concrete implementation of how the `render()`
	 * method should work. This is useful when you want all subclasses to follow a certain
	 * contract or behavior (in this case, having a render functionality).
	 */
	public abstract void render();

}