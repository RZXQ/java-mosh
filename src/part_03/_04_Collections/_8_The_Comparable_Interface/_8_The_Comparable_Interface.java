package part_03._04_Collections._8_The_Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Introduction:
// -------------
// This tutorial demonstrates how to use the Comparable interface
// in Java to sort a list of custom objects. We'll create a simple
// Customer class and implement Comparable to define the natural
// ordering of Customer objects based on their names.

public class _8_The_Comparable_Interface {

	public static void main(String[] args) {
		// Create a list to store Customer objects.
		List<Customer> customers = new ArrayList<>();

		// Add Customer objects to the list with different names.
		customers.add(new Customer("Charlie"));
		customers.add(new Customer("Alice"));
		customers.add(new Customer("Bob"));

		// Before sorting, the list is in the order items were added.
		System.out.println("Before sorting:");
		System.out.println(customers);

		// Sorting the list of customers.
		// Collections.sort() uses the compareTo() method defined in Customer.
		Collections.sort(customers);

		// After sorting, the list is ordered based on customer names.
		System.out.println("After sorting:");
		System.out.println(customers);
	}

}
