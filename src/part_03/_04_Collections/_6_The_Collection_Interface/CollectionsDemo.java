package part_03._04_Collections._6_The_Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

	public static void show() {
		Collection<String> collection = new ArrayList<>();

		// 1. add(): Add items to the collection one by one
		collection.add("a");
		collection.add("b");
		collection.add("c");

		// 2. Collections.addAll(): Add multiple items to the collection at once
		Collections.addAll(collection, "d", "e", "f");

		// 3. Iterating: Iterate over the collection and print each item
		for (var item : collection) {
			System.out.println(item);
		}

		// 4. size(): Get the number of items in the collection
		System.out.println(collection.size());

		// 5. remove(): Remove a specific item from the collection
		collection.remove("a");

		// 6. clear(): Remove all items from the collection
		collection.clear();

		// 7. isEmpty(): Check if the collection is empty
		System.out.println(collection.isEmpty());

		// 8. contains(): Check if the collection contains a specific item
		System.out.println(collection.contains("a"));

		// 9. toArray(): Convert the collection to an array
		var stringArray = collection.toArray(new String[0]);

		// 10. addAll(): Add all items from one collection to another
		Collection<String> other = new ArrayList<>();
		other.addAll(collection);

		// 11. equals(): Check if two collections are equal
		System.out.println(collection.equals(other));
	}

}