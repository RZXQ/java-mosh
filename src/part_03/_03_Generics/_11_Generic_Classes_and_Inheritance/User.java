package part_03._03_Generics._11_Generic_Classes_and_Inheritance;

public class User implements Comparable<User>, Cloneable {

	private final int points;

	public User(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(User otherUser) {
		return this.points - otherUser.points;
	}

	@Override
	public String toString() {
		return "Points = " + this.points;
	}

}
