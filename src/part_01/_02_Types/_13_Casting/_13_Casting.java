package part_01._02_Types._13_Casting;

public class _13_Casting {
    public static void main(String[] args) {
        // 1. Implicit Casting (Automatic Type Conversion)
        // - Java automatically converts smaller types to larger types in a specific order:
        //   byte -> short -> int -> long -> float -> double.
        // - This is safe because there is no risk of data loss when going from a smaller to a larger type.

        // Example: short to int (implicit)
        short x1 = 1; // 'short' is smaller than 'int', so Java automatically casts it to 'int'.
        int y1 = x1 + 2; // Here, 'x1' is treated as an 'int' in the calculation.
        System.out.println(y1); // Output: 3

        // Example: implicit casting with double
        double x2 = 1.1; // 'double' type is assigned directly
        double y2 = x2 + 2; // 2 is treated as a double (2.0), no explicit cast is needed.
        System.out.println(y2); // Output: 3.1

        // 2. Explicit Casting (Manual Type Conversion)
        // - When going from a larger type to a smaller type, data may be lost, so Java requires explicit casting.

        // Example: double to int (explicit)
        double x3 = 1.1;
        int y3 = (int) x3 + 2; // 'x3' is cast to 'int', dropping the decimal part (1.1 becomes 1).
        System.out.println(y3); // Output: 3

        // 3. String to Numeric Types
        // - Converting strings to numbers requires special methods because Java does not allow direct casting from String to numeric types.

        // Example: String to int
        String x4 = "1"; // 'x4' is a String, not an int.
        int y4 = Integer.parseInt(x4) + 2; // 'Integer.parseInt' converts 'x4' to int.
        System.out.println(y4); // Output: 3

        // Example: String to double
        String x5 = "1.1";
        double y5 = Double.parseDouble(x5) + 2; // 'Double.parseDouble' converts 'x5' to double.
        System.out.println(y5); // Output: 3.1
    }
}