package part_03._03_Generics._7_Type_Erasure;

/// **Type Erasure in Java Generics (How Generics Work Under the Hood):**
///
/// 1. **What is Type Erasure?**
///    - Type erasure is the process by which the Java compiler removes all generic type information during compilation.
///    - Generic type parameters (like `T`) are replaced with their bounds or `Object` if unbounded.
///    - As a result, the compiled bytecode contains ordinary classes and methods without generics.
///
/// 2. **Why Does Java Use Type Erasure?**
///    - **Backward Compatibility:**
///      - Generics were introduced in Java 5.
///      - Type erasure allows new generic code to run on older versions of the JVM.
///      - Maintains compatibility with legacy code written before generics existed.
///    - **No Need to Modify the JVM:**
///      - By erasing generic types at compile time, the JVM doesn't need to understand generics.
///      - This avoids requiring all users to update their JVMs.
///    - **Simplifies Language Implementation:**
///      - Reduces complexity in the language and compiler.
///      - Avoids runtime overhead associated with maintaining type information.
///
/// 3. **Effects and Limitations of Type Erasure:**
///    - **Cannot Instantiate Generic Types Directly:**
///      - You cannot create instances of `T` using `new T()` because the exact type isn't known at runtime.
///    - **Cannot Create Generic Arrays:**
///      - You cannot create arrays of `T` (e.g., `new T[10]`) due to lack of runtime type information.
///    - **Cannot Use `instanceof` with Type Parameters:**
///      - You cannot perform checks like `instanceof T` because `T` doesn't exist at runtime.
///    - **Workarounds:**
///      - Use type tokens (`Class<T> clazz`) when type information is needed at runtime.
///      - Cast carefully and suppress warnings when you're certain it's safe (`@SuppressWarnings("unchecked")`).
///
/// 4. **Type Erasure with Bounds:**
///    - **Single Bound:**
///      - If you specify an upper bound (e.g., `T extends Number`), the compiler replaces `T` with `Number`.
///      - Allows use of methods defined in `Number` on `T`.
///    - **Multiple Bounds:**
///      - For multiple bounds (e.g., `T extends Comparable & Cloneable`), `T` is replaced with the first bound (`Comparable`).
///      - The type argument must satisfy all bounds, but only the first is used for type erasure.
///      - **Note:** If a class is among the bounds, it must be listed first (before interfaces).
///
/// 5. **Viewing Bytecode to See Type Erasure:**
///    - You can inspect the compiled bytecode to see how generics are handled.
///    - In your IDE, build the project and use the "Show Bytecode" feature to view the `.class` file.
///    - You'll observe that generic type parameters have been replaced according to type erasure rules.
///
/// **Summary:**
/// - **Type Erasure** removes generic type information at compile time, replacing type parameters with their bounds or `Object`.
/// - This design choice maintains backward compatibility and simplifies the Java language.
/// - Understanding type erasure explains certain limitations of generics and helps you write better, more effective generic code.

public class GenericList<T extends Comparable & Cloneable> {
	
	// Suppress the unchecked cast warning due to type erasure
	@SuppressWarnings("unchecked")
	private final T[] list = (T[]) new Object[10];
	
	private int count;
	
	public void add(T item) {
		list[count++] = item;
	}
	
	public T get(int index) {
		return list[index];
	}
	
}
