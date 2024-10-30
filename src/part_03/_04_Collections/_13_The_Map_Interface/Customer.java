package part_03._04_Collections._13_The_Map_Interface;

public class Customer {

	private String name;

	private String email;

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
		return "Customer{" + "name='" + name + '\'' + '}';
	}

}
