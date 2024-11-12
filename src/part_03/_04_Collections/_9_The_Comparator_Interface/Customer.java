package part_03._04_Collections._9_The_Comparator_Interface;

public class Customer {

	private final String email;

	private String name;

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer{" + "name='" + name + '\'' + ", email='" + email + '\'' + '}';
	}

}
