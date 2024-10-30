package part_03._04_Collections._8_The_Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _8_The_Comparable_Interface {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("b"));
		customers.add(new Customer("c"));
		customers.add(new Customer("d"));

		Collections.sort(customers);
		System.out.println(customers);
	}

}
