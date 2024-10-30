package part_03._04_Collections._7_The_List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Common: The List interface extends the Collection interface, so it inherits all the methods from the Collection interface.
// 2. Difference: The Collection interface does not support indexing.
public class ListDemo {

	public static void show() {
		List<String> list = new ArrayList<>();

		// 1. list.add(): Add items to the list
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(0, "!"); // Add item at a specific index

		// 2. Collections.addAll(): Add multiple items to the list at once
		Collections.addAll(list, "a", "b", "c", "a");

		// 3. list.get(index): Get the item at a specific index
		System.out.println(list.get(0));

		// 4. list.set(index, ?): Modify the item at a specific index
		list.set(0, "a+");

		// 5. list.remove(index): Remove the item at a specific index
		list.remove(0);

		// 6. list.indexOf(): Get the index of the first occurrence of an item
		System.out.println(list.indexOf("a"));

		// 7. list.lastIndexOf(): Get the index of the last occurrence of an item
		System.out.println(list.lastIndexOf("a"));

		// 8. list.subList(int fromIndex, int toIndex): Get a sub-list from the list
		System.out.println(list.subList(0, 2));

		// Print the entire list
		System.out.println(list);
	}

}