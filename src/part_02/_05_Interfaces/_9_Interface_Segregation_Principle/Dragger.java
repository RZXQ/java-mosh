package part_02._05_Interfaces._9_Interface_Segregation_Principle;

/// ### 1. Coupling Issue (when not applying the Interface Segregation Principle):
/// Including multiple methods, such as drag and resize, in the same UIWidget interface causes tight coupling
/// between the Dragger class and the UIWidget interface. If any method in UIWidget, such as resize, changes
/// (e.g., by adding parameters), the whole UIWidget interface needs to be recompiled.
/// This affects the Dragger class even if it only uses the drag method and not the resize method,
/// due to its dependency on the entire UIWidget interface.
///
/// ### 2. Solution (applying the Interface Segregation Principle):
/// Divide the UIWidget interface into smaller, more focused interfaces.
/// Each interface should be dedicated to a single capability, reducing the likelihood of unintended dependencies and recompilations.
///
/// #### Example:
/// ```java
/// interface DraggableWidget {
///     void drag();
/// }
/// interface ResizableWidget {
///     void resize();
/// }
/// ```
/// ### 3. Parameter vs. Argument
///
/// - **Definition**:
///     - **Parameter**: Variable in the function definition.
///     - **Argument**: Actual value passed to the function.
///
/// - **Location**:
///     - **Parameter**: Located in the function signature.
///     - **Argument**: Passed during the function call.
///
/// - **Example**:
///     - **Parameter**: `int a, int b` in `public int add(int a, int b)`.
///     - **Argument**: `5, 10` in `example.add(5, 10)`.
///
/// - **Analogies**:
/// 	- **Parameter**: Think of it as a placeholder or a named box.
/// 	- **Argument**: Think of it as the content or the value put inside the box when you need to do something with it.
///
/// ### 4. Naming Conventions for Interfaces:
/// - Use a name that describes the capability or functionality provided by the interface.
/// 	- Example: Draggable (indicates the ability to be dragged)
public class Dragger {

	public void drag(UIWidget widget) {
		widget.drag();
		System.out.println("Dragging done!");
	}

}