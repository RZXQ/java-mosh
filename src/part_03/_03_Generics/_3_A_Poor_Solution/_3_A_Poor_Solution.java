package part_03._03_Generics._3_A_Poor_Solution;

public class _3_A_Poor_Solution {

	public static void main(String[] args) {
		var list = new List();
		list.add(1); // Java would automatically box this int to Integer
		list.add("1"); // Adding a String to the list
		list.add(new User());// Adding a User object to the list

		int number1 = (int) list.get(0); // Correctly retrieves the Integer value
		int number2 = (int) list.get(1); // This will cause a ClassCastException at
											// runtime, since the element is a String
	}

}