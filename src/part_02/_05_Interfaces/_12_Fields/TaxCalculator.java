package part_02._05_Interfaces._12_Fields;

/// ## Why introduce fields in interface are considered a bad design ?
///
/// 1. **Violation of Interface Abstraction**: Interfaces are meant to define "what" an object can do (its behavior) without dictating "how" it stores data. Including fields in interfaces mixes the definition of behavior with state management, which can lead to a loss of abstraction. This violates the principle of keeping interfaces behavior-oriented and separate from implementation details.
///
/// 2. **Reduced Flexibility**: Fields in interfaces can limit flexibility. When a field is defined in an interface, all classes that implement the interface are forced to use the same field. This restricts the ability of different classes to have their own unique way of managing or representing the data associated with the field.
///
/// 3. **Increased Coupling**: Defining fields in an interface can create tighter coupling between the interface and its implementers. If the interface needs to be changed (e.g., a field type needs to be updated), all implementing classes might also need to be modified. This increases maintenance effort and reduces the scalability of the design.
///
/// 4. **Encapsulation Issues**: Fields in interfaces might expose internal implementation details, which breaks encapsulation. Ideally, the internal state of an object should be hidden and accessible only through well-defined methods. Fields in an interface make the state directly accessible, which can lead to unintended usage or modifications.
///
/// 5. **Conflicting with Interface Purpose**: The primary purpose of interfaces is to define contracts (i.e., a set of behaviors), not to hold state or implementation details. Adding fields shifts the interface's role from defining "what to do" to "how to do it," which blurs the boundary between interface and implementation, leading to design confusion.
///
/// 6. **Inheritance Complexity**: Interfaces are commonly used in situations where multiple inheritance (through interfaces) is beneficial. If interfaces have fields, it can introduce complexities and ambiguities, especially when two or more interfaces with the same field are implemented by the same class.
public interface TaxCalculator {

	// public final static
	float minimumTax = 100;

	// public abstract
	double calculateTax();

}
