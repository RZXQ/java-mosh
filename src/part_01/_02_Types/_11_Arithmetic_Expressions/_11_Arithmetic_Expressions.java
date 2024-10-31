package part_01._02_Types._11_Arithmetic_Expressions;

public class _11_Arithmetic_Expressions {

    public static void main(String[] args) {

        // 1. Basic Arithmetic Operations
        // 1.1 Addition: Adds 10 and 3, stores result in additionResult
        int additionResult = 10 + 3;
        System.out.println("10 + 3 = " + additionResult); // Expected Output: 13

        // 1.2 Integer Division: Divides 10 by 3, stores result in divisionResult
        int divisionResult = 10 / 3;
        System.out.println("10 / 3 = " + divisionResult); // Expected Output: 3 (integer part only)

        // 2. Increment Operations (Demonstrates incrementing a variable by 1)

        // Initialize x to 1 to demonstrate increment behavior
        int x = 1; // Start value for x

        // 2.1 Post-increment (x++): Increments AFTER current value is used
        // 2.1.1 Increment x and output result
        x++; // Equivalent to x = x + 1, x becomes 2
        System.out.println("x after x++: " + x); // Expected Output: 2

        // 2.1.2 Example of post-increment behavior with y1
        // y1 gets the current value of x (2), then x is incremented to 3
        int y1 = x++;
        System.out.println("x after second x++: " + x); // Expected Output: 3
        System.out.println("y1 after assigning x++: " + y1); // Expected Output: 2 (y1 gets value before increment)

        // 2.2 Pre-increment (++x): Increments BEFORE the value is used
        // 2.2.1 Example of pre-increment behavior with y2
        // x is incremented to 4 first, then assigned to y2
        int y2 = ++x;
        System.out.println("x after ++x: " + x); // Expected Output: 4
        System.out.println("y2 after assigning ++x: " + y2); // Expected Output: 4 (y2 gets incremented value of x)
    }
}