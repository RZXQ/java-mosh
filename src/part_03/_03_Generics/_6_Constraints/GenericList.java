package part_03._03_Generics._6_Constraints;

/// Bounded Type Parameters in Generics
///
/// 1. What is a Bounded Type Parameter?
///    - In Java generics, a *bounded type parameter* allows you to restrict the types
///      that can be used as type arguments.
///    - By specifying a bound, you ensure that the type parameter must be either a specific class
///      or a subclass (or implementor) of that class or interface.
///
/// 2. Example: `public class GenericList<T extends Number>`
///    - Here, `T` is a type parameter bounded by the `Number` class.
///    - This means `T` can only be `Number` or any of its subclasses like `Integer`, `Double`, `Float`, etc.
///    - You cannot use non-numeric types like `String` with this generic class.
///
/// 3. Using Interfaces as Bounds
///    - The bound can also be an interface.
///    - For example: `public class GenericList<T extends Comparable>`
///    - This means `T` must implement the `Comparable` interface.
///    - The list will only store items that are comparable, allowing you to compare elements.
///
/// 4. Multiple Bounds
///    - You can specify multiple bounds by using the `&` symbol.
///    - Example: `public class GenericList<T extends Comparable & Cloneable>`
///    - Here, `T` must implement **both** the `Comparable` and `Cloneable` interfaces.
///    - **Important Notes:**
///      - If you're bounding `T` with both a class and interfaces, the class must come first.
///        - Correct: `T extends SomeClass & Interface1 & Interface2`
///        - Incorrect: `T extends Interface1 & SomeClass` (This will cause a compile-time error)
///
/// 5. Working with Generic Arrays
///    - You cannot create an array of a generic type directly due to type erasure.
///    - To work around this limitation, you create an array of `Object` and cast it to `T[]`.
///    - This cast leads to an unchecked warning because the compiler cannot guarantee the type safety.
///    - You can suppress this warning using `@SuppressWarnings("unchecked")`, but you should do so cautiously.
public class GenericList<T extends Comparable & Cloneable> {

	// Suppress the unchecked cast warning
	@SuppressWarnings("unchecked")
	private T[] list = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		list[count++] = item;
	}

	public T get(int index) {
		return list[index];
	}

}
