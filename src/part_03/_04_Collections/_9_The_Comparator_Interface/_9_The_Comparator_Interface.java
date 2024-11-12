package part_03._04_Collections._9_The_Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Introduction:
// -------------
// This tutorial demonstrates how to use the Comparator interface in Java
// to sort a list of custom objects based on different attributes.
// We'll also explore the difference between Comparable and Comparator,
// and understand when to use each.

// Key Concepts:
// - Comparable: Defines natural ordering within the class itself.
// - Comparator: Defines custom ordering outside the class, allows multiple sort criteria.

public class _9_The_Comparator_Interface {

	public static void main(String[] args) {
		// Step 1: Create a list of Customer objects.
		List<Customer> customers = new ArrayList<>();

		// Adding customers with names and emails.
		customers.add(new Customer("Bob", "bob@example.com"));
		customers.add(new Customer("Alice", "alice@example.com"));
		customers.add(new Customer("Charlie", "charlie@example.com"));

		// Before sorting, the list is in the order items were added.
		System.out.println("Before sorting:");
		for (Customer customer : customers) {
			System.out.println(customer);
		}

		// Step 2: Sort the list using the EmailComparator.
		// Collections.sort() accepts a Comparator to define custom sorting.
		Collections.sort(customers, new EmailComparator());

		// After sorting, the list is ordered based on email addresses.
		System.out.println("\nAfter sorting by email:");
		for (Customer customer : customers) {
			System.out.println(customer);
		}

		// Step 3: Sort the list using the NameComparator.
		// We can sort the same list differently using another Comparator.
		Collections.sort(customers, new EmailComparator());

		// Now the list is sorted by customer names.
		System.out.println("\nAfter sorting by name:");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
