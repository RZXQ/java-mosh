package part_02._05_Interfaces._9_Interface_Segregation_Principle;

/// ### 1. Original Implementation:
/// The old way: Including multiple abstract methods (drag, resize, render) in a single interface.
/// This approach is not ideal because it results in tight coupling.
/// Any change in the UIWidget interface affects all implementing classes, even if they only utilize one of the methods.
///
/// Example of the old implementation (commented out):
/// ```java
/// void drag();
/// void resize();
/// void render();
/// ```
/// ### 2. Improved Implementation Using Specific Interfaces:
/// Solution: Use the `extends` keyword to create more specific interfaces.
/// This allows combining multiple interfaces into one, ensuring that implementing classes are only dependent on the methods they truly need.
/// The improved approach adheres to the Interface Segregation Principle (ISP), which promotes smaller, more focused interfaces.
///
/// Example:
/// ```java
/// public interface UIWidget extends Draggable {
///     void resize(int size);
///     void render();
/// }
///
/// public interface Draggable {
///     void drag();
/// }
/// ```
/// Implementation Differences:
/// - In the original approach, one interface contains all methods (drag, resize, render).
/// - In the improved approach, `UIWidget` extends `Draggable`, thus inheriting the `drag` method, while adding more specific methods (`resize`, `render`).
///
/// The difference is that by extending `Draggable`, any class implementing `UIWidget` will need to implement `drag` as well. However, `Draggable` can be used independently by other classes that only need the `drag` functionality without the additional methods in `UIWidget`.
public interface UIWidget extends Draggable, Resizable { // Java interface can have multiple parents
	
	void render();

}