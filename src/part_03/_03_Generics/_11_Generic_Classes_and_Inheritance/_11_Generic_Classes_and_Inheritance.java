package part_03._03_Generics._11_Generic_Classes_and_Inheritance;

public class _11_Generic_Classes_and_Inheritance {

	public static void main(String[] args) {

		// @formatter:off

		// Basic Inheritance Example:
		// - In Java, a subclass can be treated as an instance of its superclass.
		//   For example, `Instructor` (subclass) is treated as `User` (superclass).
		// Uncomment the line below to see basic inheritance in action.
		// User user = new Instructor(10); // Works because `Instructor` is a `User`
		// Utils.printUser(user); // Prints `Instructor` info as a `User`

		// Generics and Type Erasure:
		// - Java generics enable working with different types while keeping code concise.
		// - Example: `GenericList<User>` is a list limited to `User` objects or its subclasses.

		// 1. Type Erasure:
		// - During compilation, Java removes specific generic type information. This is
		//   called "type erasure," so `GenericList<User>` and `GenericList<Instructor>`
		//   both become `GenericList` at runtime (i.e., treated as `GenericList<Object>`).
		// - This makes generics compatible with older Java versions, but it removes
		//   detailed type info at runtime.

		// 2. Invariance in Generics:
		// - Despite erasure at runtime, generics are enforced as invariant at compile time.
		//   Invariance means that `GenericList<Instructor>` is NOT a subtype of `GenericList<User>`,
		//   even if `Instructor` is a subtype of `User`.
		// - This restriction prevents mixing types. For example, if `GenericList<Instructor>`
		//   could be assigned to `GenericList<User>`, we might insert `User` objects that
		//   are not `Instructor`, breaking type safety.

		// Example:
		// Uncommenting the line below will produce a compile-time error. This is because
		// `GenericList<Instructor>` cannot be assigned to `GenericList<User>` due to invariance.
		// var users = new GenericList<Instructor>(); // Compile-time error

		// Type Safety with Generics:
		// - Java enforces type matching at compile time to prevent incorrect type usage.
		// - A method expecting `GenericList<User>` won’t accept `GenericList<Instructor>`,
		//   maintaining safety in generic collections.

		// @formatter:on

		// Create a generic list specifically for the `User` type.
		var users = new GenericList<User>(); // Works because `users` is
												// `GenericList<User>`

		Utils.printUsers(users); // Valid as `users` matches `GenericList<User>`
	}

}