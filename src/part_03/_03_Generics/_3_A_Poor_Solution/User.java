package part_03._03_Generics._3_A_Poor_Solution;

public class User {

	private final User[] items = new User[10];

	private int count;

	public void add(User item) {
		items[count++] = item;
	}

	public User get(int index) {
		return items[index];
	}

}
