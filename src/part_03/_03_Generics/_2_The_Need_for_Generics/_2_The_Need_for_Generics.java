package part_03._03_Generics._2_The_Need_for_Generics;

/**
 * This class illustrates why generics are useful in Java. Without generics, we would need
 * separate classes for each data type (e.g., List for integers, UserList for User
 * objects). With generics, we can create a single class that works with different data
 * types.
 */
public class _2_The_Need_for_Generics {

	public static void main(String[] args) {
		// 1. Example: Using a non-generic List class
		// - This List class can only handle integers.
		// - If we wanted to add other types of data, we would need a different
		// class for each type.

		// Creating a list that can only store integers.
		var list = new List();
		list.add(1); // Works for integers, but not flexible for other data types.

		// 2. Potential for using Generics
		// - With generics, we could define a single List<T> that works with any
		// data type provided at runtime.

		// Creating a UserList to store User objects.
		var userList = new UserList();
		userList.add(new User()); // Adding a User to the UserList.
	}

}