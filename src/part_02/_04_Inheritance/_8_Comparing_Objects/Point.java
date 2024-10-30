package part_02._04_Inheritance._8_Comparing_Objects;

import java.util.Objects;

public class Point {
	
	private int x;  // The x-coordinate of the point
	private int y;  // The y-coordinate of the point
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Pattern Variable: The variable `point` in `(o instanceof Point point)` is a pattern
	 * variable. Once the `instanceof` check is successful, `point` is automatically cast to
	 * type Point and can be used directly within the same block.
	 * Usage: This avoids the need for a separate cast operation, making the code more
	 * concise and readable.
	 *
	 * Checks if this Point object is equal to another object.
	 *
	 * @param o the object to compare with this Point.
	 * @return true if the objects are considered equal, false otherwise.
	 *
	 * Detailed Steps:
	 * 1. If the compared object is the same instance as this one, they are equal.
	 * 2. If the compared object is not an instance of Point, they are not equal.
	 * 3. Cast the compared object to a Point and compare their x and y values.
	 *    If both x and y are the same, the points are considered equal.
	 */
	@Override
	public boolean equals(Object o) {
		// Step 1: Check if the compared object is the same instance
		if (this == o) return true;
		
		// Step 2: Check if the compared object is not a Point
		if (!(o instanceof Point point)) return false;
		
		// Step 3: Compare individual x and y values
		return x == point.x && y == point.y;
	}
	
	/**
	 * Generates a hash code for this Point object.
	 *
	 * @return an integer hash code value for this Point.
	 *
	 * Detailed Explanation:
	 * Uses the built-in Objects.hash method to generate a hash code based on the x and y values.
	 * The hash code is used in hashing-based collections like HashMap and HashSet to quickly
	 * locate an object.
	 */
	@Override
	public int hashCode() {
		// Generate a hash code based on the x and y values of the point
		return Objects.hash(x, y);
	}
}