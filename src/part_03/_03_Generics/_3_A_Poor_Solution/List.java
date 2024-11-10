package part_03._03_Generics._3_A_Poor_Solution;

public class List {

	private final Object[] items = new Object[10];

	private int count;

	public void add(Object item) {
		this.items[this.count++] = item;
	}

	public Object get(int index) {
		return this.items[index];
	}

}
