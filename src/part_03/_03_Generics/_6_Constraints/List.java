package part_03._03_Generics._6_Constraints;

public class List {

	private Object[] items = new Object[10];

	private int count;

	public void add(Object item) {
		items[count++] = item;
	}

	public Object get(int index) {
		return items[index];
	}

}
