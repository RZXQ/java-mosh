package part_03._04_Collections._6_The_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

	public static void show() {

		// Introduction to Collections:
		// ----------------------------
		// In Java, the Collection interface is the root of the collections framework.
		// It represents a group of objects, known as elements.
		// Common implementations include ArrayList, LinkedList, HashSet, etc.
		// All collections implement the Iterable interface, allowing for-each loops.
		// We'll explore basic CRUD operations: Create, Read, Update, Delete.

		// CREATE Operations
		// -----------------

		// 1. Create a new Collection of Strings.
		// We use ArrayList which implements the Collection interface.
		Collection<String> collection = new ArrayList<>();

		// 2. Add elements individually using add().
		collection.add("a"); // Adds "a" to the collection.
		collection.add("b"); // Adds "b" to the collection.
		collection.add("c"); // Adds "c" to the collection.

		// 3. Add multiple elements at once using Collections.addAll().
		Collections.addAll(collection, "d", "e", "f"); // Adds "d", "e", "f".

		// 4. Add all elements from another collection using addAll().
		Collection<String> other = new ArrayList<>();
		other.add("x");
		other.add("y");
		other.add("z");

		collection.addAll(other); // Adds "x", "y", "z" to collection.

		// READ Operations
		// ----------------

		// 5. Iterate over the collection using a for-each loop.
		// Since Collection is Iterable, we can loop through its elements.
		System.out.println("Elements in the collection:");
		for (String item : collection) {
			System.out.println(item); // Prints each element.
		}

		// 6. Get the number of elements using size().
		int size = collection.size(); // Retrieves the number of elements.
		System.out.println("Size of collection: " + size); // Prints the size.

		// 7. Check if the collection contains a specific element using contains().
		boolean hasA = collection.contains("a"); // Checks for "a".
		System.out.println("Contains 'a': " + hasA); // Prints true or false.

		// 8. Check if two collections are equal using equals().
		// Collections are equal if they have the same elements in the same order.
		Collection<String> collectionCopy = new ArrayList<>(collection);
		boolean areEqual = collection.equals(collectionCopy); // Should be true.
		System.out.println("Collections are equal: " + areEqual);

		// Comparing with 'other' collection.
		boolean areEqualOther = collection.equals(other); // Should be false.
		System.out.println("Collection equals 'other': " + areEqualOther);

		// UPDATE Operations
		// ------------------

		// Note: Collection interface doesn't support direct update operations.
		// Since we can't access elements by index, we remove and add elements to update.

		// Example: Update "a" to "alpha".
		if (collection.contains("a")) {
			collection.remove("a"); // Remove the old element.
			collection.add("alpha"); // Add the new element.
		}

		// Let's print the collection after the update.
		System.out.println("Collection after updating 'a' to 'alpha':");
		for (String item : collection) {
			System.out.println(item);
		}

		// DELETE Operations
		// ------------------

		// 9. Remove a specific element using remove().
		collection.remove("b"); // Removes "b" from the collection.

		// 10. Remove all elements using clear().
		collection.clear(); // Empties the collection.

		// 11. Check if the collection is empty using isEmpty().
		boolean isEmpty = collection.isEmpty(); // Checks if collection is empty.
		System.out.println("Is the collection empty? " + isEmpty);

		// OTHER Operations
		// -----------------

		// 12. Convert the collection to an array using toArray().
		// First, let's add some elements back to the collection.
		Collections.addAll(collection, "p", "q", "r");

		// Convert the collection to an array.
		String[] array = collection.toArray(new String[0]);
		System.out.println("Array elements:");
		for (String s : array) {
			System.out.println(s);
		}

	}

}
