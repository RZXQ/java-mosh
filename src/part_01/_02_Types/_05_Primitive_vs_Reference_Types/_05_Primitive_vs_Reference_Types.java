package part_01._02_Types._05_Primitive_vs_Reference_Types;

import java.awt.*;

public class _05_Primitive_vs_Reference_Types {

	public static void main(String[] args) {
		// 1. primitive type:
		byte x = 1;
		byte y = x;
		x = 2; // x and y are completely independent of each other
		System.out.println(y);

		// 2. reference type:
		Point point1 = new Point(1, 1);
		Point point2 = point1; // point1 and point2 are referencing the same object:
								// Object Point(1, 1)

		point1.x = 2;
		System.out.println(point2);
	}

}