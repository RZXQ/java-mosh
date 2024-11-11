package part_03._03_Generics._11_Generic_Classes_and_Inheritance;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User> {

	private final int points;

	public User(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(@NotNull User other) {
		return this.points - other.points;
	}

	@Override
	public String toString() {
		return "User{" + "points=" + points + '}';
	}

}
