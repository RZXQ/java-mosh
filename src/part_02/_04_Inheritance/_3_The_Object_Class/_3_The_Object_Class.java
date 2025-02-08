package part_02._04_Inheritance._3_The_Object_Class;

public class _3_The_Object_Class {

	public static void main(String[] args) {
		TextBox box1 = new TextBox();
		TextBox box2 = box1;

		/*
		 * =============================== hashcode() ================================
		 * hashCode() returns an integer representing the object's memory address. Since
		 * box1 and box2 refer to the same object, their hash codes are identical.
		 * ===============================================================================
		 */
		System.out.println(box1.hashCode());
		System.out.println(box2.hashCode());

		/*
		 * ============================ equals() ======================================
		 * equals() checks if two references point to the same object. Here, box1 and box2
		 * refer to the same TextBox instance, so it prints true.
		 * ===============================================================================
		 */
		System.out.println(box1.equals(box2));

		/*
		 * ========================== equals() =====================================
		 * Overriding equals() for content comparison Note: To compare object content,
		 * override equals() in the TextBox class.
		 * ===============================================================================
		 */

		/*
		 * ============================ toString() =====================================
		 * Default toString() prints class name followed by "@" and the object's hashcode.
		 * box1 and box1.toString() will print the same result.
		 * ===============================================================================
		 */
		System.out.println(box1.hashCode()); // Decimal hashCode: 1531448569
		System.out.println(box1); // Hexadecimal format: TextBox@5b480cf9
	}

}
