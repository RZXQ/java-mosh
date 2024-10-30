package part_03._04_Collections._11_The_Set_Interface;

import java.util.*;

/// Class to demonstrate usage of the Set interface in Java.
/// The Set interface is part of the Java Collections Framework and is used to store unique elements.
///
/// Key Points:
/// 1. **Unordered Collection**: A Set does not guarantee the order of elements. Thus, the order in which elements are inserted might not be the order in which they are stored.
/// 2. **Unique Elements**: A Set only stores unique values. Duplicate values are automatically ignored.
///
/// The `SetDemo` class contains several examples of using sets:
/// - Initializing a `HashSet` and adding elements, including a duplicate element, to showcase that duplicates are ignored.
/// - Using `Collections.addAll` to populate a collection and then removing duplicates by creating a new `HashSet`.
/// - Demonstrating basic set operations:
///   - **Union**: Using `addAll` to combine two sets.
///   - **Intersection**: Using `retainAll` to find common elements between two sets.
///   - **Difference**: Using `removeAll` to find elements that are only in one set but not in another.
public class SetDemo {

	public static void show() {

		Set<String> set1 = new HashSet<>();
		set1.add("sky");
		set1.add("is");
		set1.add("blue");
		set1.add("blue"); // Duplicate "blue" will not be added
		// The order of elements in the set may differ from the order of insertion
		System.out.println(set1);

		// Remove duplicates using Collections.addAll and new HashSet<>(collection)
		Collection<String> collection = new ArrayList<>();
		Collections.addAll(collection, "a", "b", "c", "c");
		Set<String> set2 = new HashSet<>(collection);
		System.out.println(set2);

		// Set operations using Arrays.asList() method
		Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
		Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));

		// Union operation:
		set3.addAll(set4);
		System.out.println(set3);

		// Intersection operation:
		set3.retainAll(set4);
		System.out.println(set3);

		// Difference operation:
		set3.removeAll(set4);
		System.out.println(set3);

	}

}