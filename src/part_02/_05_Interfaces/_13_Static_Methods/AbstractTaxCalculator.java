package part_02._05_Interfaces._13_Static_Methods;

/// When a class **extends an abstract class** and **implements an interface** simultaneously, the following principles generally apply:
///
/// 1. **Abstract Class - Focus on Inheritance**:
///    - The abstract class is used to define **common behaviors or state** that all child classes should share.
///      It typically contains both fully implemented methods (which provide a base implementation that all subclasses inherit) and abstract methods (which child classes must implement).
///    - This suggests that the abstract class focuses more on **what all child classes must have or do**. It serves as a template, enforcing structure but also allowing the child classes to inherit and reuse some common logic.
///    - The abstract class may also contain fields or instance variables, emphasizing shared **state** or data across subclasses.
///
/// 2. **Interface - Specification of Behavior**:
///    - The interface, on the other hand, defines a **contract** or a list of methods that a class must implement.
///      Interfaces do not provide implementation for these methods (unless using default methods), so they focus solely on the **what**—defining the capabilities a class should have.
///    - The class that implements the interface is responsible for providing the **how**—the actual implementation of those methods.
///      Since the interface is behavior-focused, different classes can implement the methods differently according to their specific needs.
///    - Interfaces support **multiple inheritance of behavior** (since a class can implement multiple interfaces), but they don't dictate how the methods should be implemented.
public abstract class AbstractTaxCalculator implements TaxCalculator {

	// what if we need to reuse this logic across all classes? use abstract class
	protected double getTaxableIncome(double income, double expenses) {
		return income - expenses;
	};

}
