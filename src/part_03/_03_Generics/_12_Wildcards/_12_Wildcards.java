package part_03._03_Generics._12_Wildcards;

/// Upper bounded wildcard (`? extends T`) and lower bounded wildcard (`? super T`)
/// exist to solve the limitations of polymorphism in generics.
///
/// ## 1. Java Generics and Polymorphism
///
/// - In regular class hierarchies, Java supports polymorphism, allowing a parent class reference to point to child class objects.
/// - However, in the generics system, due to type invariance, this polymorphism cannot be directly applied.
/// - Thus, wildcards (`? extends T` and `? super T`) are introduced to provide flexibility similar to polymorphism.
///
/// ## 2. Upper Bounded Wildcard (`? extends T`): Solving the Polymorphism Problem for Subtypes
///
/// - **Purpose**: Allows using subtypes of `T` in generic types, providing covariance, meaning you can read elements of type `T` or its subtypes.
/// - **Use case**: When you only need to read elements from a generic collection, using `? extends T` lets the method accept a collection of `T` or its subtypes.
///
/// ### Example:
/// ```java
/// public static void printNumbers(List<? extends Number> list) {
///     for (Number num : list) {
///         System.out.println(num);
///     }
/// }
///
/// List<Integer> intList = new ArrayList<>();
/// List<Double> doubleList = new ArrayList<>();
/// printNumbers(intList);  // Allowed: List<Integer>
/// printNumbers(doubleList);  // Allowed: List<Double>
/// ```
///
/// - **Limitation**: You cannot add elements to a `List<? extends Number>` because the compiler cannot determine the exact subtype. It only knows the element is a `Number` or a subtype, but not specifically which one.
///
/// ## 3. Lower Bounded Wildcard (`? super T`): Solving the Polymorphism Problem for Supertypes
///
/// - **Purpose**: Allows using a parent class of `T` in generics, providing contravariance, meaning you can safely write elements of type `T`.
/// - **Use case**: When you only need to write elements into a collection, using `? super T` lets the method accept a collection of `T` or any parent class of `T`.
///
/// ### Example:
/// ```java
/// public static void addNumbers(List<? super Integer> list) {
///     list.add(1);  // Can add Integer types
/// }
///
/// List<Number> numList = new ArrayList<>();
/// addNumbers(numList);  // Allowed: List<Number>
/// ```
///
/// - **Limitation**: You can only safely add `Integer` or its subtypes to `List<? super Integer>`. When reading elements, they will be treated as `Object` because the compiler cannot determine the exact subtype or supertype.
///
/// ## 4. Comparing Generic Lists vs Simple Generic Classes
///
/// - **Generic Lists**: Due to type invariance in Java, you cannot pass `List<Integer>` to a method expecting `List<Number>`. Thus, wildcards are needed to handle polymorphism in these cases. Using `? extends` allows the method to accept `T` and its subtypes.
/// - **Simple Generic Classes**: Polymorphism in generic classes (such as `Box<T>`) is already solved using Java’s inherent polymorphism. Even if `T` is `Integer` or `Double`, polymorphism with `Number` works without needing wildcards.
///
/// ## 5. Code Comparison: Generic Lists vs Simple Generic Classes
///
/// ### Generic Lists:
/// ```java
/// // Polymorphism in generic lists:
/// // Requires wildcards to handle subtypes.
///
/// List<Integer> intList = new ArrayList<>();
/// List<Double> doubleList = new ArrayList<>();
/// printNumbers(intList);  // Allowed: List<Integer>
/// printNumbers(doubleList);  // Allowed: List<Double>
///
/// public static void printNumbers(List<? extends Number> list) {
///     for (Number num : list) {
///         System.out.println(num);
///     }
/// }
/// ```
///
/// ### Generic Classes:
/// ```java
/// // Polymorphism in generic classes:
/// // No need for wildcards, handled by standard polymorphism.
///
/// Box<Integer> intBox = new Box<>(42);
/// Box<Double> doubleBox = new Box<>(3.14);
/// printBox(intBox);  // Allowed: Box<Integer>
/// printBox(doubleBox);  // Allowed: Box<Double>
///
/// public static void printBox(Box<Number> box) {
///     System.out.println(box.getValue());
/// }
///
/// class Box<T> {
///     private T value;
///     public Box(T value) {
///         this.value = value;
///     }
///     public T getValue() {
///         return value;
///     }
/// }
/// ```
///
/// ## 6. Summary
///
/// - **Generic Lists**: Due to type invariance, wildcards are required to handle subtypes.
/// - **Simple Generic Classes**: Java’s standard polymorphism is sufficient, and wildcards are not necessary in this context.
public class _12_Wildcards {

	public static void main(String[] args) {
		User user = new Instructor(10);
		Utils.printUser(new Instructor(10));

		var users = new GenericList<User>();
		Utils.printUsersExtends(users);

		var instructors = new GenericList<Instructor>();
		Utils.printUsersExtends(instructors);
	}

}
