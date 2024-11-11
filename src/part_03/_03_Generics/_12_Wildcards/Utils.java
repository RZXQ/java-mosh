package part_03._03_Generics._12_Wildcards;

public class Utils {

	public static void printUser(User user) {
		System.out.println(user);
	}

	// This method uses `? extends User`, meaning we can read a `User` or any subclass
	// of `User` from the list.
	// `GenericList<? extends User>` allows safe reading from the list, but prevents
	// adding new elements due to uncertainty about the exact subtype of `User`.
	public static void printUsersExtends(GenericList<? extends User> users) {
		// `users.get(0)` returns an element of type `capture of ? extends User`.
		// This capture type is treated as `User` (the upper bound), so assigning it to
		// a `User` variable is safe.
		User x = users.get(0); // We can read as `User` since we know it’s at least
								// `User`.

		// Adding new elements isn’t allowed with `? extends User` because we don’t know
		// the exact subtype. It could be `User`, `Instructor`, or another subclass, so
		// Java prevents adding to maintain type safety.
		// below is not allowed, as `? extends User` could capture a subclass.
		// users.add(new User());
	}

	// This method uses `? super User`, meaning we can add `User` or any of its subclasses
	// to the list, but reads are only guaranteed as `Object`.
	// `GenericList<? super User>` allows adding `User` types, as it can capture a
	// superclass that safely accommodates `User` and its subclasses.
	public static void printUsersSuper(GenericList<? super User> users) {
		// We can safely add `User` or any of its subclasses to the list.
		users.add(new User(2)); // Adding a `User` is allowed.
		users.add(new Instructor(2)); // Adding an `Instructor` (subclass of `User`) is
		// also allowed.

		// Reading from the list returns `Object` because `? super User` could capture
		// `Object` or any superclass of `User`.
		Object x = users.get(0); // We retrieve an `Object` as the exact type is unknown.
	}

}