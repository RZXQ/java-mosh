package part_03._04_Collections._9_The_Comparator_Interface;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getEmail().compareTo(c2.getEmail());
	}

}
