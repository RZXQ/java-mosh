package part_03._03_Generics._7_Type_Erasure;

public class List {

	private final Object[] items = new Object[10];

	private int count;

	public void add(Object item) {
		items[count++] = item;
	}

	public Object get(int index) {
		return items[index];
	}

}
