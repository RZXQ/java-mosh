package part_03._03_Generics._9_Generic_Methods;

public class Utils {

	// @formatter:off
	// This method `max` is an example of a generic method, which allows it to work
	// flexibly with various types. A generic method has type parameters defined
	// specifically for that method. It doesn't require the class itself to be generic.
	// Here, `max` is in a non-generic class (`Utils`), demonstrating that generic
	// methods can exist independently of the class’s generic status.

	// `<T extends Comparable<T>>`:
	// - This syntax defines `T` as the type parameter for `max`. `T` acts as a
	//   placeholder for any type that the method will use when it’s called.
	// - The constraint `extends Comparable<T>` ensures that `T` can be compared,
	//   meaning only types implementing `Comparable` can be passed to `max`.
	// - This constraint makes it possible for `max` to compare two instances of `T`,
	//   allowing the method to work with types like `Integer`, `String`, or any
	//   custom type implementing `Comparable`.

	public static <T extends Comparable<T>> T max(T first, T second) {
		return first.compareTo(second) < 0 ? second : first; // returns larger of the two
	}
}