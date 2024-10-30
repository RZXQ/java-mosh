package part_03._04_Collections._9_The_Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

///
/// The `Comparable` and `Comparator` interfaces in Java are used to compare and sort objects, but they serve different purposes.
///
/// ### 1. `Comparable` Interface:
/// - **Purpose**: Defines the **natural ordering** of objects.
///   - "Natural ordering" means that the objects themselves know how they should be compared and sorted, like numbers (sorted from smallest to largest) or strings (sorted alphabetically).
/// - **Implementation**: You implement the `Comparable` interface **inside the class** whose objects you want to compare. This is useful when the comparison logic is intrinsic to the class.
/// - **compareTo() method**: The class must override the `compareTo()` method, which determines how two objects should be compared.
/// - **Usage**: If an object implements `Comparable`, it can be sorted using `Collections.sort()` or by a data structure like `TreeSet` that relies on natural ordering.
/// - **Example**: A `Person` class could define natural ordering based on their names (alphabetically):
///
/// ```java
/// class Person implements Comparable<Person> {
///     private String name;
///
///     public int compareTo(Person other) {
///         return this.name.compareTo(other.name); // natural order by name
///     }
/// }
/// ```
/// - **Limitation**: Only one sorting logic can be defined using `Comparable`.
///
/// ### 2. `Comparator` Interface:
/// - **Purpose**: Allows for **custom sorting** outside of the object's natural order.
///   - This is useful when you want to sort objects in multiple ways or when you can't modify the class to implement `Comparable`.
/// - **Implementation**: A separate class or anonymous class implements the `Comparator` interface, providing custom sorting logic in the `compare()` method.
/// - **compare() method**: You must override the `compare()` method to define how two objects should be compared.
/// - **Usage**: `Comparator` can be passed to sorting methods like `Collections.sort()` or `Arrays.sort()` to define custom sorting at runtime.
/// - **Example**: A `Person` class can be sorted by age using a `Comparator`:
///
/// ```java
/// class AgeComparator implements Comparator<Person> {
///     public int compare(Person p1, Person p2) {
///         return Integer.compare(p1.getAge(), p2.getAge()); // custom order by age
///     }
/// }
/// ```
/// - **Flexibility**: Multiple `Comparator` implementations can be created for different ways of sorting (e.g., by name, by age, etc.).
///
/// ### Key Differences:
/// - `Comparable` is used when you want the class to have a **default, natural order** (e.g., strings alphabetically, numbers numerically).
/// - `Comparator` is used when you need **multiple ways to sort** or when you don't want to or can't modify the class.
///
/// Below is an example using the `Comparator` interface to sort customers by their email addresses.
public class _9_The_Comparator_Interface {

	public static void main(String[] args) {
		// 1. Create a list of customers
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("b", "e3"));
		customers.add(new Customer("a", "e2"));
		customers.add(new Customer("c", "e1"));

		// 2. Sorting using a custom comparator.
		// We are sorting the customers based on their email addresses using the
		// `EmailComparator`.
		// Instead of natural ordering, this custom comparator defines how the comparison
		// is done.
		Collections.sort(customers, new EmailComparator());

		// 3. Printing the sorted list.
		// After sorting by email, the order of customers in the list will be according to
		// their email addresses.
		// The customers will be printed in the order of "e1", "e2", "e3".
		System.out.println(customers);
	}

}