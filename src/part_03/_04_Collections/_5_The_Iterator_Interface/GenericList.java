package part_03._04_Collections._5_The_Iterator_Interface;

import org.jetbrains.annotations.NotNull;
import java.util.Iterator;

// We define a generic class called GenericList that implements Iterable<T>.
public class GenericList<T> implements Iterable<T> {

	// Create an array to store items of type T.

	// Since Java doesn't allow creating generic arrays directly, we create an Object
	// array and cast it to T[]. The @SuppressWarnings annotation tells the compiler to
	// ignore warnings about this unchecked cast.
	@SuppressWarnings("unchecked")
	private final T[] items = (T[]) new Object[10];

	private int count = 0;

	public void add(T item) {
		items[count] = item;
		count++;
	}

	public T get(int index) {
		return items[index];
	}

	// This method is required by the Iterable interface.
	// It returns an Iterator<T> that can be used to iterate over the list.
	@Override
	public @NotNull Iterator<T> iterator() {
		// Return a new instance of ListIterator, passing in this list
		return new ListIterator(this);
	}

	// Define an inner class called ListIterator that implements Iterator<T>.
	// This iterator will allow us to traverse the elements of the list.
	private class ListIterator implements Iterator<T> {

		private final GenericList<T> list; // The list we're iterating over

		private int index = 0; // Current position in the list

		// Constructor for the iterator, takes the list to iterate over
		public ListIterator(GenericList<T> list) {
			this.list = list; // Store the reference to the list
			// index is already initialized to 0
		}

		// Method to check if there are more elements to iterate over
		@Override
		public boolean hasNext() {
			// If the current index is less than the number of items, there are more
			// elements
			return index < list.count;
		}

		// Method to get the next element in the iteration
		@Override
		public T next() {
			// Retrieve the item at the current index
			return list.items[this.index++];// Move to the next index for the next call
		}

	}

}