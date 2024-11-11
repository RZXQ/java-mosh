package part_03._03_Generics._10_Multiple_Type_Parameters;

// A. The `KeyValuePair` class uses multiple type parameters, `K` and `V`, to store a key-value pair.
// - Multiple type parameters (`<K, V>`) can be used in both classes and methods.
// - In this case, they are used in a class to represent a generic key-value structure.

public class KeyValuePair<K, V> {

	private final K key; // Type `K` for the key

	private final V value; // Type `V` for the value

	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	// This approach makes `KeyValuePair` reusable for any key-value types, such as
	// `String`-`Integer`.

}