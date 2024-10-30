package part_03._03_Generics._9_Generic_Methods;

import org.jetbrains.annotations.NotNull;

/// 1. Implementing the Comparable Interface:
///
/// - Any class that implements the `Comparable` interface must provide an implementation of the `compareTo()` method.
/// - The `compareTo()` method defines how objects of the class are compared to each other.
/// - This is useful for sorting objects or determining their natural ordering.
public class User implements Comparable<User> {

	private int points;

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
