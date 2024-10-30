package part_03._03_Generics._7_Type_Erasure;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User>, Cloneable {

	private final User[] items = new User[10];

	private int count;

	public void add(User item) {
		items[count++] = item;
	}

	public User get(int index) {
		return items[index];
	}

	@Override
	public int compareTo(@NotNull User o) {
		return 0;
	}

}
