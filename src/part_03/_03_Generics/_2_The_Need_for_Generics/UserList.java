package part_03._03_Generics._2_The_Need_for_Generics;

public class UserList {

	private final User[] users = new User[10];

	private int count;

	public void add(User user) {
		this.users[this.count++] = user;
	}

	public User get(int index) {
		return this.users[index];
	}

}
