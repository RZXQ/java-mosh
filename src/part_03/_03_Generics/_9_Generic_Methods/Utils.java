package part_03._03_Generics._9_Generic_Methods;

import org.jetbrains.annotations.Contract;

/// **Generic Methods in Java**:
///
/// 1. **What is a Generic Method?**
///    - A generic method is a method that has its own type parameter(s), allowing it to work with different types.
///    - Generic methods can be declared inside both generic and non-generic classes.
///    - By using type parameters, a generic method can operate on objects of various types while ensuring type safety.
///
/// 2. **Using the Comparable Interface in Generic Methods**:
///    - To compare two objects of a generic type `T`, `T` must implement the `Comparable` interface.
///    - This ensures that the `compareTo` method is available for comparing objects of type `T`.
///    - The constraint is specified as `<T extends Comparable<T>>`, meaning `T` must be comparable to another instance of `T`.
///
/// 3. **Understanding `@Contract(pure = true)`**:
///    - The `@Contract` annotation is from the JetBrains annotations library.
///    - `pure = true` indicates that the method has no side effects. It doesn’t modify any fields or objects.
///    - This helps tools like IntelliJ IDEA analyze and optimize the method effectively.
///
/// 4. **Summary**:
///    - **For a Generic Class**: The type parameters come **right after the class name**:
///
///    ```java
///    public class KeyValuePair<K, V> { /* class body */ }
///    ```
///    - **For a Generic Method**: The type parameters come **before the return type**:
///
///    ```java
///    public static <K, V> void print(K key, V value) { /* method body */ }
///    ```
public class Utils {

	@Contract(pure = true)
	public static <T extends Comparable<T>> T max(T first, T second) {
		return first.compareTo(second) < 0 ? second : first;
	}

}
