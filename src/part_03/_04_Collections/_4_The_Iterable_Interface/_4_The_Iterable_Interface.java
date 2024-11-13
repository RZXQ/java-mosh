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
		// - `next()`: Returns the next element in the collection and advances the
		// iterator.
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

		// @formatter:off
		// 2. **Iterator Object Points to Elements**
		//
		// Think of the iterator as a cursor that points directly at elements in the collection.
		// Initially, before the first call to `next()`, the iterator is positioned **before** the
		// first element.
		//
		// Each call to `next()` moves the iterator forward and returns the current element.
		//
		// For example, consider the list: [a, b, c]
		//
		// Visual representation:
		//
		// Before calling `next()`:
		// (iterator is before the first element)
		//    a  b  c
		// ↑
		//
		// After calling `next()` once:
		// (iterator has advanced to the first element)
		// a  b  c
		// ↑
		// Returned element: a
		//
		// After calling `next()` again:
		// (iterator has advanced to the second element)
		// a  b  c
		// 	  ↑
		// Returned element: b
		//
		// After calling `next()` the third time:
		// (iterator has advanced past the last element)
		// a  b  c
		//       ↑
		// Returned element: c
		//
		// After the last element, `hasNext()` will return false.
		//
		// The iterator advances through the collection, pointing at each element in turn.

		// 3. **For-each Loop is Syntactic Sugar**
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
