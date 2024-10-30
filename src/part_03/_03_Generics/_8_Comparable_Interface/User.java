package part_03._03_Generics._8_Comparable_Interface;

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
	public int compareTo(User otherUser) {
		/// Compare this user's points with another user's points.
		/// Subtract the other user's points from this user's points:
		/// - If the result is positive, this user has more points.
		/// - If the result is negative, this user has fewer points.
		/// - If the result is zero, both users have the same number of points.
		return this.points - otherUser.points;
	}

}
