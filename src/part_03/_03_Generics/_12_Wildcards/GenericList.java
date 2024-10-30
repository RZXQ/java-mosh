package part_03._03_Generics._12_Wildcards;

public class GenericList<T extends Comparable & Cloneable> {

	private final T[] list = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		list[count++] = item;
	}

	public T get(int index) {
		return list[index];
	}

}
