package part_03._04_Collections._13_The_Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void show() {
		var c1 = new Customer("a", "e1");
		var c2 = new Customer("b", "e2");

		Map<String, Customer> map = new HashMap<>();

		// 1. map.put()
		// Add Customer objects to the map with email as the key
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(), c2);

		// 2. map.get()
		// Retrieve Customer object for existing and non-existing keys
		var customer1 = map.get("e1"); // Expected to find c1
		var customer2 = map.get("e10"); // Not found, should return null
		System.out.println(customer1);
		System.out.println(customer2);

		// 3. getOrDefault
		// Retrieve Customer object with a default value if key is not found
		var unknown = new Customer("Unknown", "");
		var customer3 = map.getOrDefault("e10", unknown); // Returns 'unknown' if key
															// "e10" is not found

		// 4. containsKey
		// Check if a specific key exists in the map
		var exists = map.containsKey("e10"); // Checks existence of key "e10"
		System.out.println(exists);

		// 5. replace()
		// Replace entry corresponding to the key "e1" with a new Customer object
		map.replace("e1", new Customer("a++", "e1")); // Replaces value for key "e1"
		System.out.println(map);

		// 6. iteration in map:
		// Iterate over keys in the map and print each key
		for (var key : map.keySet()) {
			System.out.println(key);
			// To print the value corresponding to each key, uncomment the line below
			// System.out.println(map.get(key));
		}

		// 7. entrySet: Set<Entry<String, Customer>>
		// Iterate over entries in the map and print each key-value pair
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// 8. values()
		// Iterate over values in the map and print each Customer object
		for (var customer : map.values()) {
			System.out.println(customer);
		}
	}

}