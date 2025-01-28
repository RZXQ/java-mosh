package part_01._03_Control_Flow._13_For_Each_Loop;

public class _13_For_Each_Loop {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Mango", "Orange" };

		/*
		 * ===============================================================================
		 * Standard For Loop
		 * ===============================================================================
		 * Note: Iterates through the array using an index. Useful when you need the
		 * index.
		 */
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		/*
		 * ===============================================================================
		 * For-Each Loop
		 * ===============================================================================
		 * Note: Iterates directly over the elements of the array. In JavaScript, the
		 * equivalent is `for...of`.
		 */
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
