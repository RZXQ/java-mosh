package part_03._03_Generics._7_Type_Erasure;

/// **Type Erasure in Java Generics:**
///
/// 1. **What is Type Erasure?**
///    - Type erasure removes all generic type information during compilation.
///    - Generic types (like `T`) are replaced with their bound (e.g., `Number`)
///      or `Object` if no bound is specified.
///
/// 2. **Why Type Erasure?**
///    - **Backward Compatibility**: Allows code with generics to work on older JVMs.
///    - **Simplifies JVM**: The JVM doesn’t need to handle generics, reducing complexity.
///
/// 3. **Limitations Due to Type Erasure:**
///    - **No Instantiation of Generic Types**: Cannot create `new T()` since type
///      information is not available at runtime.
///    - **No Generic Arrays**: Cannot create arrays of `T` (`new T[10]`), so we use
///      `Object[]` and cast to `T[]`.
///    - **No `instanceof` Checks on Generic Types**: Cannot do `instanceof T` due to
///      lack of runtime type information.
///
/// 4. **Type Erasure with Bounds**:
///    - **No Bound**: If `T` has no bound, `T` is replaced with `Object`.
///    - **Single Bound**: If `T` has a single upper bound (e.g., `T extends Number`),
///      `T` is replaced with that bound (e.g., `Number`).
///    - **Multiple Bounds**: If `T` has multiple bounds (e.g., `T extends Comparable & Cloneable`),
///      `T` is replaced by the first bound (usually a class or the primary interface).
///
/// **Summary**:
/// - Type erasure removes generic type info at compile time, making generics compatible with older Java versions.
/// - It also explains why certain operations (like `new T[]`) aren’t allowed with generics.

public class GenericList<T> {

	// Type erasure replaces `T` with `Object` (if no bound is set), so we cast `Object[]`
	// to `T[]`.
	private final T[] items = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		this.items[this.count++] = item;
	}

	public T get(int index) {
		return this.items[index];
	}

}