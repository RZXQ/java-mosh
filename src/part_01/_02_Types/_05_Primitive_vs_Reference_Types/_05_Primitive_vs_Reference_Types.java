package part_01._02_Types._05_Primitive_vs_Reference_Types;

import java.awt.*;

public class _05_Primitive_vs_Reference_Types {
    public static void main(String[] args) {
        // 1. Primitive Type:
        byte x = 1;        // 'x' is stored on the stack with the value 1
        byte y = x;        // 'y' is stored on the stack as a separate copy of 'x'

        x = 2;             // Changing 'x' does not affect 'y' since 'y' has its own value on the stack
        System.out.println(y); // Output will be 1 because 'y' is an independent copy of 'x'

        // 2. Reference Type:
        Point point1 = new Point(1, 1); // 'point1' is a reference stored on the stack, pointing to a Point object on the heap
        Point point2 = point1;          // 'point2' is another reference on the stack pointing to the same object on the heap

        /*
         * Explanation of Stack and Heap with Reference Types:
         * - Stack: Holds variable references (e.g., 'point1' and 'point2') and primitives (e.g., 'x' and 'y').
         * - Heap: Holds objects themselves, like the 'Point' object created by 'new Point(1, 1)'.
         * - Here, 'point1' and 'point2' both store the memory address of the same Point object on the heap.
         */

        point1.x = 2;  // Changing the object via 'point1' also affects 'point2', since they both point to the same heap object
        System.out.println(point2); // Output will be (2, 1), showing the updated value

        /*
         * Summary of Key Points:
         * 1. Primitive Types (stored in stack):
         *    - Primitive values are stored directly in the stack.
         *    - Copying a primitive type (e.g., 'y = x;') creates a separate, independent copy on the stack.
         *    - Any change in one copy (e.g., changing 'x') does not affect the other (e.g., 'y').
         *
         * 2. Reference Types (stack and heap):
         *    - Variables like 'point1' and 'point2' store references (addresses) on the stack.
         *    - The actual object (e.g., 'new Point(1, 1)') is stored in the heap.
         *    - Copying a reference (e.g., 'point2 = point1;') means both references point to the same object in the heap.
         *    - Changes made to the object through one reference (e.g., 'point1.x = 2') will be visible to all references.
         */
    }
}