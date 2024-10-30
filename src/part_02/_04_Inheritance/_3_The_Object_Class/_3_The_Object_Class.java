package part_02._04_Inheritance._3_The_Object_Class;

public class _3_The_Object_Class {

	public static void main(String[] args) {
		TextBox box1 = new TextBox();
		TextBox box2 = box1;

		// 1. hashCode: The hashCode() method returns an integer value representing the
		// memory address of the object.
		// Since both box1 and box2 refer to the same object, their hash codes will be
		// identical.
		System.out.println(box1.hashCode());
		System.out.println(box2.hashCode());

		// 2. equals: The equals() method checks if two references point to the same
		// object.
		// Here, box1 and box2 both refer to the same TextBox instance, so this will print
		// true.
		System.out.println(box1.equals(box2));

		// 3. To compare the content of two different objects, you will need to override
		// the equals() method in the TextBox class.

		// 4. toString() method: By default, the toString() method prints the class name
		// followed by the "@" character and the object's hashcode.
		// Since box1 and box1.toString() are the same call, they will print the same
		// result.
		System.out.println(box1);
		System.out.println(box1.toString());
	}

}