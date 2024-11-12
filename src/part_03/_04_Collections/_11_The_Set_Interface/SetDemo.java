package part_03._04_Collections._11_The_Set_Interface;

import java.util.*;

// Introduction:
// -------------
// This tutorial demonstrates how to use the Set interface in Java.
// Sets are collections that do not allow duplicate elements.
// They are useful when you want to ensure that each element is unique.
// We'll explore creating sets, adding elements, and performing set operations
// like union, intersection, and difference.

public class SetDemo {

	public static void show() {

		// Creating a Set:
		// ---------------
		// We use HashSet, which is a common implementation of the Set interface.
		// HashSet does not maintain any order of its elements.
		Set<String> set1 = new HashSet<>();

		// ADDING ELEMENTS:
		// ----------------
		// 1. Adding elements to the set using add().
		set1.add("sky");
		set1.add("is");
		set1.add("blue");

		// 2. Attempting to add a duplicate element.
		// - Since sets do not allow duplicates, "blue" will not be added again.
		set1.add("blue"); // Duplicate "blue" will not be added.

		// Note:
		// -----
		// - Sets ensure uniqueness of elements.
		// - The order of elements in a HashSet is not guaranteed.
		System.out.println("Set1 contents: " + set1);

		// REMOVING DUPLICATES FROM A COLLECTION:
		// --------------------------------------
		// Suppose you have a collection with duplicates.
		Collection<String> collection = new ArrayList<>();
		Collections.addAll(collection, "a", "b", "c", "c"); // "c" is duplicated.

		// 3. Creating a set from the collection to remove duplicates.
		Set<String> set2 = new HashSet<>(collection);

		// Now, set2 contains only unique elements.
		System.out.println("Set2 contents (duplicates removed): " + set2);

		// SET OPERATIONS:
		// ---------------
		// Sets support mathematical set operations like union, intersection, and
		// difference.
		// We'll demonstrate these using two sets.

		// 4. Creating two sets using Arrays.asList().
		Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
		Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));

		// UNION OPERATION:
		// ----------------
		// The union of two sets contains all elements from both sets.
		// We use addAll() to achieve this.

		Set<String> union = new HashSet<>(set3); // Create a new set to avoid modifying
													// set3.
		union.addAll(set4); // Adds all elements of set4 to the union set.

		System.out.println("Union of set3 and set4: " + union);

		// INTERSECTION OPERATION:
		// -----------------------
		// The intersection of two sets contains only elements present in both sets.
		// We use retainAll() to achieve this.

		Set<String> intersection = new HashSet<>(set3); // Create a new set from set3.
		intersection.retainAll(set4); // Keeps only elements also in set4.

		System.out.println("Intersection of set3 and set4: " + intersection);

		// DIFFERENCE OPERATION:
		// ---------------------
		// The difference of two sets contains elements in the first set not present in
		// the second.
		// We use removeAll() to achieve this.

		Set<String> difference = new HashSet<>(set3); // Create a new set from set3.
		difference.removeAll(set4); // Removes elements that are also in set4.

		System.out.println("Difference of set3 and set4: " + difference);

		// SUMMARY:
		// --------
		// - Sets are useful for storing unique elements.
		// - HashSet does not maintain order; use LinkedHashSet or TreeSet for ordered
		// sets.
		// - Set operations allow for efficient mathematical computations.

	}

}
