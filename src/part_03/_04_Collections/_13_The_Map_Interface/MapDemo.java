package part_03._04_Collections._13_The_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void show() {
		// 1. Introduction to Map Interface
		// Map is an interface in the Java Collections Framework.
		// It represents a collection that maps keys to values.
		// A Map cannot contain duplicate keys; each key maps to at most one value.

		// HashMap is a class that implements the Map interface.
		// It uses a hash table to store the mappings and provides efficient operations.

		// 2. Creating Customer Objects
		var c1 = new Customer("Alice", "alice@example.com");
		var c2 = new Customer("Bob", "bob@example.com");

		// 3. Creating a Map
		// Map<K, V>: K is the type of keys, V is the type of values
		Map<String, Customer> map = new HashMap<>();

		// CRUD Operations:

		// 4. Create (C): Adding entries to the map

		// 4.1 Using put()
		// put(key, value): Adds a key-value pair to the map.
		// If the key already exists, it updates the value.
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(), c2);

		// Note: In a Map, keys are unique.
		// Adding an entry with an existing key overwrites the previous value.

		// 5. Read (R): Retrieving entries from the map

		// 5.1 Using get()
		// get(key): Retrieves the value associated with the key.
		// Returns null if the key does not exist.
		var customer1 = map.get("alice@example.com"); // Retrieves c1
		var customerNotFound = map.get("charlie@example.com"); // Key not found, returns
																// null
		System.out.println("Customer1: " + customer1);
		System.out.println("CustomerNotFound: " + customerNotFound);

		// 5.2 Using getOrDefault()
		// getOrDefault(key, defaultValue): Returns the value for the key,
		// or defaultValue if the key isn't found.
		var unknownCustomer = new Customer("Unknown", "");
		var customer2 = map.getOrDefault("charlie@example.com", unknownCustomer);
		System.out.println("Customer2: " + customer2);

		// 5.3 Using containsKey()
		// containsKey(key): Checks if the map contains the specified key.
		boolean exists = map.containsKey("bob@example.com"); // Returns true
		System.out.println("Key exists: " + exists);

		// 6. Update (U): Updating entries in the map

		// 6.1 Using replace()
		// replace(key, newValue): Replaces the value associated with the key.
		map.replace("alice@example.com", new Customer("Alice Updated", "alice@example.com"));
		System.out.println("After replace: " + map.get("alice@example.com"));

		// 7. Delete (D): Removing entries from the map

		// 7.1 Using remove()
		// remove(key): Removes the key-value pair associated with the key.
		map.remove("bob@example.com");
		System.out.println("After remove: " + map.get("bob@example.com")); // Should be
																			// null

		// 8. Map Iteration

		// 8.1 Iterating over keys using keySet()
		// keySet() returns a Set of all the keys in the map.
		System.out.println("Keys in map:");
		for (var key : map.keySet()) {
			System.out.println(key);
		}

		// 8.2 Iterating over values using values()
		// values() returns a Collection of all the values in the map.
		System.out.println("Values in map:");
		for (var customer : map.values()) {
			System.out.println(customer);
		}

		// 8.3 Iterating over entries using entrySet()
		// entrySet() returns a Set of Map.Entry objects, representing key-value pairs.
		System.out.println("Entries in map:");
		for (var entry : map.entrySet()) {
			// entry.getKey() retrieves the key
			// entry.getValue() retrieves the value
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
