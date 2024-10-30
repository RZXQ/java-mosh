package part_02._05_Interfaces._13_Static_Methods;

/// Why should not add static methods to interfaces?
/// 1. **Breaks the Concept of Interface as a Contract**: Interfaces are primarily meant to define a contract that the implementing classes must follow.
/// They define behaviors without specifying implementation. Static methods in interfaces provide specific implementations,
/// which goes against the core purpose of an interface as a behavior definition without implementation details.
///
/// 2. **No Polymorphism**: Static methods cannot be overridden in implementing classes.
/// One of the main advantages of using interfaces is the ability to use polymorphism, allowing different classes to provide their own specific implementations.
/// Static methods are bound at compile time, not at runtime, so they don't participate in polymorphism, which limits flexibility in object-oriented design.
///
/// 3. **Encourages Mixing Implementation with Abstraction**: By allowing static methods, the interface starts to mix abstraction (which defines behavior) with implementation.
/// This can make the code harder to maintain because it blurs the separation of concerns between what an object does and how it does it.
///
/// 4. **Poor Extensibility**: Since static methods belong to the interface itself and cannot be overridden by the implementing classes,
/// it reduces the flexibility of future changes. If a new behavior or extension is needed, the static method must either be modified (breaking backward compatibility)
/// or replaced by a new method, leading to potential duplication.
///
/// 5. **Alternative Options Exist**: If shared functionality is needed across multiple classes, it can be implemented in other ways such as utility classes or default methods.
/// Utility classes, which hold static methods, can group related functionality without polluting the interface definition, keeping the interface focused purely on behavior.
///
/// 6. **Complicates Unit Testing**: Static methods in interfaces can be difficult to mock or replace during unit testing.
/// Unlike instance methods, which can be overridden by mocking frameworks, static methods are harder to isolate and can lead to more complex testing scenarios.
public interface TaxCalculator {

	// static double getTaxableIncome(double income, double expenses) {
	// return income - expenses;
	// }

	double calculateTax();

}
