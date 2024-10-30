package part_01._03_Control_Flow._13_For_Each_Loop;

public class _13_For_Each_Loop {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Mango", "Orange" };

		// Iterating through the array using a standard for loop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		// Iterating through the array using a for-each loop
		// Limitations of for-each loop:
		// 1. Cannot iterate backwards
		// 2. Cannot access the index of an element
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}