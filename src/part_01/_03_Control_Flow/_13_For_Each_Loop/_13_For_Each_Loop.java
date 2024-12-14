package part_01._03_Control_Flow._13_For_Each_Loop;

public class _13_For_Each_Loop {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Mango", "Orange" };

		// Standard for loop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		// For-each loop
		// Note: Cannot iterate backwards or access element indices
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
