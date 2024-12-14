package part_01._02_Types._05_Primitive_vs_Reference_Types;

import java.awt.*;

public class _05_Primitive_vs_Reference_Types {

	public static void main(String[] args) {
		// 1. Primitive Type:
		byte x = 1;
		byte y = x;

		x = 2;
		System.out.println(x); // Output will be 2
		System.out.println(y); // Output will be 1

		// 2. Reference Type:
		Point point1 = new Point(1, 1);
		Point point2 = point1;
		point1.x = 2;

		System.out.println(point2); // Output will be (2, 1)

	}

}