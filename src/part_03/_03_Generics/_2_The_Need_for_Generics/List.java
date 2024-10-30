package part_03._03_Generics._2_The_Need_for_Generics;

public class List {

	private int[] items = new int[10];

	private int count;

	public void add(int item) {
		items[count++] = item;
	}

	public int get(int index) {
		return items[index];
	}

}
