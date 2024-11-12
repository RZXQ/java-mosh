package part_03._04_Collections._7_The_List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Introduction:
// -------------
// The List interface in Java extends the Collection interface.
// This means it inherits all methods from Collection.
// The key difference is that List supports indexing,
// allowing access to elements based on their position.

public class ListDemo {

	public static void show() {

		// Creating a List:
		// ----------------
		// We create a List of Strings using ArrayList,
		// which is a resizable array implementation of List.
		List<String> list = new ArrayList<>();

		// ADD Operations:
		// ---------------

		// 1. Adding elements individually using add().
		list.add("a"); // Adds "a" at the end of the list.
		list.add("b"); // Adds "b" at the end.
		list.add("c"); // Adds "c" at the end.

		// 2. Adding an element at a specific index.
		list.add(0, "!"); // Inserts "!" at index 0, shifts others right.

		// 3. Adding multiple elements at once using Collections.addAll().
		Collections.addAll(list, "a", "b", "c", "a"); // Adds all at the end.

		// READ Operations:
		// ----------------

		// 4. Accessing elements by index using get(index).
		String firstItem = list.get(0); // Gets element at index 0.
		System.out.println("First item: " + firstItem);

		// 5. Finding the index of the first occurrence of an element.
		int indexOfA = list.indexOf("a"); // Searches from start to end.
		System.out.println("First index of 'a': " + indexOfA);

		// 6. Finding the index of the last occurrence of an element.
		int lastIndexOfA = list.lastIndexOf("a"); // Searches from end to start.
		System.out.println("Last index of 'a': " + lastIndexOfA);

		// UPDATE Operations:
		// ------------------

		// 7. Modifying an element at a specific index using set(index, element).
		list.set(0, "a+"); // Replaces element at index 0 with "a+".

		// DELETE Operations:
		// ------------------

		// 8. Removing an element by index using remove(index).
		list.remove(0); // Removes the element at index 0.

		// SUBLIST Operation:
		// ------------------

		// 9. Getting a portion of the list using subList(fromIndex, toIndex).
		// Creates a view from fromIndex (inclusive) to toIndex (exclusive).
		List<String> subList = list.subList(0, 2); // Gets elements at index 0 and 1.
		System.out.println("Sublist: " + subList);

		// DISPLAYING THE LIST:
		// --------------------

		// Printing the entire list.
		System.out.println("Complete list: " + list);

		// ITERATING OVER THE LIST:
		// ------------------------

		// Using a for-each loop to iterate over the list.
		System.out.println("Iterating over the list:");
		for (String item : list) {
			System.out.println(item);
		}

		// ADDITIONAL NOTES:
		// -----------------

		// - Lists maintain insertion order.
		// - They allow duplicate elements.
		// - Indexing starts from 0.
		// - Negative indices are invalid and will throw an exception.
	}

}
