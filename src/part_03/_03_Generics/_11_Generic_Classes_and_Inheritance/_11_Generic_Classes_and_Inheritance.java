package part_03._03_Generics._11_Generic_Classes_and_Inheritance;

public class _11_Generic_Classes_and_Inheritance {

	public static void main(String[] args) {
		// Using polymorphism: Instructor is a subclass of User
		User user = new Instructor(10);
		Utils.printUser(new Instructor(10));

		// Creating a GenericList of Users
		var users = new GenericList<User>();
		Utils.printUsers(users);

		// Why can't we use GenericList<Instructor> with the printUsers method?
		// -------------------------------------------------------------------
		// 1. Although Instructor is a subclass of User, GenericList<Instructor> is NOT a
		// subclass of GenericList<User>.
		// 2. Java Generics are invariant. This means that GenericList<A> and
		// GenericList<B> are considered unrelated types, even if A is a subclass of B.
		// 3. Type erasure in Java: During compilation, generic type information is
		// erased. Given `GenericList<T extends Comparable & Cloneable>`, both
		// GenericList<Instructor> and GenericList<User> are treated as
		// `GenericList<Comparable>` after type erasure, not `GenericList<Object>`.
		// Therefore, attempting to use a GenericList<Instructor> where a
		// GenericList<User> is expected results in a compilation error.

		// Creating a GenericList of Instructors
		var instructors = new GenericList<Instructor>();
		// Uncommenting the following line would result in a compilation error:
		// Utils.printUsers(instructors);
	}

}