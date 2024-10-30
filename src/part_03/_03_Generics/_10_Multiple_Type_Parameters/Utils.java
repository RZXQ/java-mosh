package part_03._03_Generics._10_Multiple_Type_Parameters;

import org.jetbrains.annotations.Contract;

/// **Multiple Type Parameters in Generics**
///
/// 1. **Using Multiple Type Parameters:**
///    - In Java, generic classes and methods can have multiple type parameters.
///    - This allows methods and classes to operate on multiple types simultaneously.
///
/// 2. **Naming Conventions:**
///    - By convention, when we have two type parameters, they are often named `K` and `V`.
///    - `K` stands for "Key" and `V` stands for "Value".
///    - This is especially common in data structures like `Map<K, V>`, where keys are mapped to values.
public class Utils {

	@Contract(pure = true)
	public static <T extends Comparable<T>> T max(T first, T second) {
		return first.compareTo(second) < 0 ? second : first;
	}

	// Multiple type parameters for method
	public static <K, V> void print(K key, V value) {
		System.out.println(key + " = " + value);
	}

}
