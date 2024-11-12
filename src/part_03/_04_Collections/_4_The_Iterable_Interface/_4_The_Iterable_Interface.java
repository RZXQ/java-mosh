package part_03._04_Collections._4_The_Iterable_Interface;

import java.util.Iterator;

public class _4_The_Iterable_Interface {

	public static void main(String[] args) {
		GenericList<String> list = new GenericList<>();

		list.add("a");
		list.add("b");
		list.add("c");

		// Obtain an iterator for the list
		Iterator<String> iterator = list.iterator();

		// 1. **Iterators in Java**
		//
		// An Iterator is an object that allows you to traverse through all the elements
		// of a collection (like a list), one element at a time.
		//
		// It provides two primary methods:
		// - `hasNext()`: Checks if there are more elements to iterate over.
		// - `next()`: Returns the next element in the collection.
		//
		// Using an iterator, you can process each element without knowing the underlying
		// structure of the collection.
		//
		// Here's how you use an iterator to go through the list:
		while (iterator.hasNext()) {
			// Retrieve the next element
			String current = iterator.next();
			System.out.println(current);
		}

		// 2. **Iterator Object is Like a Cursor Pointing to Elements**
		//
		// Think of the iterator as a cursor or pointer that moves through the collection.
		// Initially, it points before the first element.
		//
		// Each call to `next()` moves the cursor to the next element and returns it.
		//
		// For example, consider the list: [a, b, c]
		//
		// Before calling `next()`:
		// [ ] a b c (cursor is before 'a')
		//
		// After calling `next()` once:
		// a [ ] b c (cursor is between 'a' and 'b')
		//
		// After calling `next()` again:
		// a b [ ] c (cursor is between 'b' and 'c')
		//
		// This continues until `hasNext()` returns false, indicating no more elements.

		// 3. **For-each Loop is Just Syntax Sugar**
		//
		// The for-each loop (enhanced for loop) simplifies iteration over collections.
		// It internally uses an iterator but provides a cleaner syntax.
		//
		// Here's how you can use a for-each loop with the list:
		for (String item : list) {
			System.out.println(item);
		}
		// This loop does the same as the iterator loop but is more concise and readable.

	}

}
