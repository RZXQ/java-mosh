package part_03._04_Collections._8_The_Comparable_Interface;

import org.jetbrains.annotations.NotNull;

// The Customer class represents a customer with a name.
// It implements Comparable<Customer> to allow sorting.
public class Customer implements Comparable<Customer> {

	private final String name; // The name of the customer.

	// Constructor to initialize the customer's name.
	public Customer(String name) {
		this.name = name;
	}

	// Implementing the compareTo() method from Comparable interface.
	// This method defines how two Customer objects are compared.
	@Override
	public int compareTo(@NotNull Customer other) {
		// Comparing customer names using String's compareTo() method.
		// It returns:
		// - a negative integer if this.name < other.name
		// - zero if this.name == other.name
		// - a positive integer if this.name > other.name
		return this.name.compareTo(other.name);
	}

	// Overriding toString() to provide a readable representation of Customer.
	@Override
	public String toString() {
		return "Customer{name='" + name + "'}";
	}

}
