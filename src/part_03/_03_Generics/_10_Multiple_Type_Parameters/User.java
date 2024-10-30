package part_03._03_Generics._10_Multiple_Type_Parameters;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User> {

	private final int points;

	public User(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(@NotNull User otherUser) {
		return this.points - otherUser.points;
	}

	@Override
	public String toString() {
		return "Points = " + this.points;
	}

}
