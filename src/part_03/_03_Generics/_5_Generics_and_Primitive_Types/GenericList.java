package part_03._03_Generics._5_Generics_and_Primitive_Types;

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
