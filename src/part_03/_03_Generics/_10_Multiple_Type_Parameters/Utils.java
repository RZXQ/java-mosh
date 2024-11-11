package part_03._03_Generics._10_Multiple_Type_Parameters;

public class Utils {

	// B. This is a generic method `print` that uses multiple type parameters `K` and `V`.
	// - Multiple type parameters (`<K, V>`) can be used in both classes and methods.
	// - Here, they are used in a method to allow flexible key-value pairs of any types.

	public static <K, V> void print(K key, V value) {
		System.out.println(key + " = " + value);
	}

	// Using `<K, V>` makes this method generic, so it can handle any combination
	// of types for `key` and `value` (e.g., `String`-`Integer`, `Integer`-`Double`).

}