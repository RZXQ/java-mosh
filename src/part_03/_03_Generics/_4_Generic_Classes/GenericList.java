package part_03._03_Generics._4_Generic_Classes;

public class GenericList<T> {

	// - Using a cast because Java does not support generic array creation.
	private final T[] items = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		this.items[this.count++] = item;
	}

	public T get(int index) {
		return this.items[index];
	}

}
