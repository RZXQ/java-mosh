package part_03._03_Generics._8_Comparable_Interface;

import org.jetbrains.annotations.NotNull;

// Implements Comparable<User> to enable sorting of User objects by their attributes
public class User implements Comparable<User> {

	// `points` represents the user's score, which is the key attribute for comparison
	private final int points;

	// Constructor to initialize the User object with the provided points value
	public User(int points) {
		this.points = points; // Assigns the passed points value to the `points` field
	}

	@Override
	public int compareTo(@NotNull User other) {
		/* @formatter:off
		 * The compareTo method is overridden from the Comparable<User> interface.
		 * This method defines how two User objects are compared based on their `points`.
		 *
		 * Important Concepts:
		 * 1. Inheritance and Interface Implementation:
		 *    - User class implements Comparable<User>, meaning User objects can be compared
		 *    - The compareTo method enables this comparison by providing logic for it
		 *
		 * 2. Method Annotation:
		 *    - @Override indicates that compareTo method overrides a superclass method
		 *    - @NotNull from org.jetbrains.annotations ensures `other` is not null
		 *
		 * Comparison Logic:
		 * 1. Returns:
		 *    - A negative integer if `this.points` < `other.points`
		 *       (i.e., this User has fewer points than the other User)
		 *    - Zero if `this.points` == `other.points`
		 *       (i.e., both Users have equal points)
		 *    - A positive integer if `this.points` > `other.points`
		 *       (i.e., this User has more points than the other User)
		 *
		 * 2. The primary criterion for comparison between User objects is
		 *    the difference in their `points`:
		 *    - The subtraction `this.points - other.points` determines the result
		 * @formatter:on
		 */
		return this.points - other.points; // Compare points to determine the order
	}

}