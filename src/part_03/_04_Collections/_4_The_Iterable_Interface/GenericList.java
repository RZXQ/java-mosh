package part_03._04_Collections._4_The_Iterable_Interface;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

// **The Iterable Interface**
//
// For a class to work with a for-each loop, it must implement the `Iterable` interface.
// This interface requires the class to provide an `iterator()` method that returns
// an `Iterator` over its elements.
//
// By implementing `Iterable`, you allow your collection to be used in enhanced for loops,
// making it easier and more intuitive to iterate over its elements.
public class GenericList<T> implements Iterable<T> {

	private final T[] items = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		this.items[this.count++] = item;
	}

	public T get(int index) {
		return this.items[index];
	}

	@Override
	public @NotNull Iterator<T> iterator() {
		return null; // Don't worry about this right now
	}

}