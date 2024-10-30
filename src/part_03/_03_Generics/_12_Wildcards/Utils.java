package part_03._03_Generics._12_Wildcards;

/// **Wildcards in Java Generics**:
///
/// 1. **Why Use Wildcards (`?`)**:
///    - Sometimes, you want your code to be flexible enough to handle **different types of objects** that share a common relationship.
///    - Wildcards (`?`) are used in generics when you don’t know or don’t want to specify the exact type, but you want to work with a **range of related types** (like `User` and its subclasses).
///    - For example, you might want a method that works with both a list of `User` objects and a list of `Instructor` objects (which are subclasses of `User`). Instead of writing a separate method for each type, you can use a wildcard.
///    - **In short**: Wildcards make your code more **general** and **reusable** by allowing it to accept different types while keeping type safety in place.
///
/// 	Wildcards are used when you need to work with a list (or collection) of some related type, like a list of User objects or a list of its subclasses.
/// 	- ? extends T is for when you need to read from the list.
/// 	- ? super T is for when you need to add to the list.
///
/// 2. **Upper Bounded Wildcard (`? extends T`)**:
///    - When we write `? extends User`, it means the list can contain **`User`** objects or **any subclass** of `User`, such as `Instructor`.
///    - This is called an **upper bound** because the type is restricted to `User` and anything **below** `User` in the inheritance tree.
///    - **Important Rule**: You can only **read** items from this list, but you **cannot add** new items (except `null`).
///      - This is because Java doesn’t know the exact type in the list. It could be `User`, or it could be `Instructor` (a subclass of `User`), so adding an element might break type safety.
///    - **Example**: A `GenericList<? extends User>` can hold `User`, `Instructor`, or any subclass of `User`, but you can't add new elements because the exact type isn’t known.
///    - When you call `get()` to read an item from the list, the result is treated as `User` (or a subclass), which Java captures internally as a type like `CAP#1 extends User`.
///
/// 3. **Lower Bounded Wildcard (`? super T`)**:
///    - When we write `? super User`, it means the list can contain **`User`** objects or **any superclass** of `User`, such as `Object`.
///    - This is called a **lower bound** because the type is restricted to `User` and anything **above** `User` in the inheritance tree.
///    - **Important Rule**: You can **add** `User` objects (or subclasses like `Instructor`) to this list, but when you **read** from the list, the elements are treated as `Object`.
///      - This is because the exact type of the list could be `Object`, `User`, or something else, so Java cannot assume the type when retrieving elements.
///    - **Example**: A `GenericList<? super User>` allows adding `User` or any subclass of `User` (like `Instructor`), but when retrieving elements, they will be treated as `Object`.
public class Utils {

	public static void printUser(User user) {
		System.out.println(user);
	}

	// This method uses `? extends User`, meaning we can read a `User` or any subclass of
	// `User`
	// from the list.
	// **Equivalent to**: class CAP#1 extends User {}
	// **Equivalent to**: class Instructor extends User {}
	public static void printUsersExtends(GenericList<? extends User> users) {
		// Since `users.get(0)` returns a `? extends User`, we can safely assign it to a
		// `User` variable.
		User x = users.get(0); // We can read from the list, but not add.

		// This is NOT allowed because we don’t know the exact subtype of the wildcard (`?
		// extends User`).
		// users.add(new User()); // Not allowed.
	}

	// This method uses `? super User`, meaning we can add `User` or any of its subclasses
	// to the list.
	// **Equivalent to**: GenericList<Object> temp = new GenericList<>();
	public static void printUsersSuper(GenericList<? super User> users) {
		// We can safely add `User` or any of its subclasses to the list.
		users.add(new User(2)); // Adding a `User` is allowed.
		users.add(new Instructor(2)); // Adding an `Instructor` (subclass of `User`) is
										// also allowed.

		// When retrieving from the list, the return type is `Object`, since the exact
		// type is unknown.
		Object x = users.get(0); // Reading from the list returns an `Object`.
	}

}
