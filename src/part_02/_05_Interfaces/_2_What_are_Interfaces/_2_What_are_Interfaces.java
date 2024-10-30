package part_02._05_Interfaces._2_What_are_Interfaces;

/// ### Interfaces
/// 1. Interface: we use interfaces to build loosely coupled, extensible, testable applications.
/// 2. Without interface: A --------> B, with interface A <-------- Interface --------> B (or C, or D).
/// 3. Interface: What should be done; Classes: How it should be done.
///
/// | Interface               | Classes                |
/// |-------------------------|------------------------|
/// | **What should be done** | **How it should be done** |
/// | - Data compression      |                        |
/// | - Encryption            |                        |
/// | - Sorting               |                        |
/// | - Searching             |                        |
///
/// Using interfaces allows for a more loosely coupled, extensible, and testable architecture. Here's a more detailed explanation:
///
/// ### Without Interfaces
/// When `A` directly depends on `B`, any change in `B` might directly affect `A`. This creates a strong coupling between `A` and `B`:
/// ```java
/// class B {
///     void doSomething() {
///         // Implementation
///     }
/// }
///
/// class A {
///     private B b = new B();
///
///     void performAction() {
///         b.doSomething();
///     }
/// }
/// ```
///
/// ### With Interfaces
/// By introducing an interface, you add an abstraction layer between `A` and `B`. This pattern facilitates easier changing of implementations and enhances testability:
/// ```java
/// interface Interface {
///     void doSomething();
/// }
///
/// class B implements Interface {
///     public void doSomething() {
///         // Implementation
///     }
/// }
///
/// class A {
///     private Interface i;
///
///     A(Interface i) {
///         this.i = i;
///     }
///
///     void performAction() {
///         i.doSomething();
///     }
/// }
/// ```
///
/// ### Benefits
/// 1. **Loosely Coupled**: `A` depends on the interface, not on the actual implementation (`B`). This allows you to easily switch implementations without changing `A`.
/// 2. **Extensibility**: You can introduce new implementations of the interface and `A` can use them without requiring changes.
/// 3. **Testability**: You can mock or stub the interface in unit tests, making it easier to test `A` in isolation.
///
/// Your conceptual diagram can be expressed through the use of UML (Unified Modeling Language) as follows:
///
/// - **Without Interface**: `A` → `B`
/// - **With Interface**: `A` → `Interface` ← `B`
///
/// This captures the idea that now both `A` and `B` are loosely coupled through an abstraction (`Interface`), enhancing your application's design.
public class _2_What_are_Interfaces {

	public static void main(String[] args) {

	}

}
