package part_03._04_Collections._5_The_Iterator_Interface;

import org.jetbrains.annotations.NotNull;
import java.util.Iterator;

/// GenericList class declaration:
/// - Implements Iterable<T>
/// - Uses an array to store elements
/// - Provides methods to add and retrieve elements
/// - Inner class ListIterator implements Iterator<T> for iteration
public class GenericList<T> implements Iterable<T> {

	// Array to store the items, initialized with a size of 10
	private T[] items = (T[]) new Object[10];

	// Variable to keep track of the number of elements added to the list
	private int count;

	// Method to add an item to the list
	public void add(T item) {
		// Add the item at the current count index, then increment the count
		items[count++] = item;
	}

	// Method to get an item from the list by index
	public T get(int index) {
		// Return the item at the specified index
		return items[index];
	}

	@Override
	// Override the iterator method from the Iterable interface
	public @NotNull Iterator<T> iterator() {
		// Return a new instance of the inner ListIterator class, passing the current list
		// instance
		return new ListIterator(this);
	}

	// Inner class ListIterator implementing Iterator for type T
	private class ListIterator implements Iterator<T> {

		// Reference to the outer GenericList instance
		private GenericList<T> list;

		// Index to keep track of the current position in the iteration
		private int index;

		// Constructor for ListIterator, taking the outer list as an argument
		public ListIterator(GenericList<T> list) {
			// Initialize the list reference with the outer instance
			this.list = list;
		}

		@Override
		// Method to check if there are more elements to iterate over
		public boolean hasNext() {
			// Return true if the current index is less than the count of items
			return (this.index < this.list.count);
		}

		@Override
		// Method to return the next element in the iteration
		public T next() {
			// Return the element at the current index, then increment the index
			return this.list.items[this.index++];
		}

	}

}