package part_03._04_Collections._8_The_Comparable_Interface;

import org.jetbrains.annotations.NotNull;

public class Customer implements Comparable<Customer> {

	private String name;

	public Customer(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(@NotNull Customer other) {
		// this < other -> -1
		// this == other -> 0
		// this > other -> 1
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + '}';
	}

}
