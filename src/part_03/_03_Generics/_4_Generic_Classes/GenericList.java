package part_03._03_Generics._4_Generic_Classes;

// T represents Type
public class GenericList<T> {

	private T[] list = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		list[count++] = item;
	}

	public T get(int index) {
		return list[index];
	}

}
