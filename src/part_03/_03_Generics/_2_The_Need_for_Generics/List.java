package part_03._03_Generics._2_The_Need_for_Generics;

public class List {

	private final int[] items = new int[10];

	private int count;

	public void add(int item) {
		this.items[this.count++] = item;
	}

	public int get(int index) {
		return this.items[index];
	}

}
