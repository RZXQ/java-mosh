package part_03._03_Generics._10_Multiple_Type_Parameters;

// Class that uses multiple type parameters
public class KeyValuePair<K, V> {

	private K key;

	private V value;

	// Constructor to initialize the key-value pair
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value = value;
	}

}