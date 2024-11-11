package part_03._03_Generics._11_Generic_Classes_and_Inheritance;

public class GenericList<T> {

	private final T[] items = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		this.items[this.count++] = item;
	}

	public T get(int index) {
		return this.items[index];
	}

}