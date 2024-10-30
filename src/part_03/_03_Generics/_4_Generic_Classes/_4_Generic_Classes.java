package part_03._03_Generics._4_Generic_Classes;

public class _4_Generic_Classes {

	public static void main(String[] args) {
		// Generics provide compile-time type safety
		// No need to explicitly cast to User from Object
		var list = new GenericList<User>();

		list.add(new User()); // Adding a User object to the list
		User user = list.get(0); // Directly retrieving a User object without casting
	}

}