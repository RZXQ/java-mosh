package part_03._03_Generics._5_Generics_and_Primitive_Types;

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
