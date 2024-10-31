package part_01._02_Types._03_Primitive_Types;

/// Variable types:
/// - Primitive types: store simple, fixed-size values (like numbers, characters, or booleans).
/// - Reference types: store complex objects (like arrays or custom classes).
///
/// ---
///
/// Primitive Types, Sizes, and Ranges:
///
/// | Type      | Size     | Range or Description                                      |
/// |-----------|----------|-----------------------------------------------------------|
/// | byte      | 8-bit    | -128 to 127                                               |
/// | short     | 16-bit   | -32,768 to 32,767                                         |
/// | int       | 32-bit   | -2^31 to 2^31 - 1 (-2,147,483,648 to 2,147,483,647)       |
/// | long      | 64-bit   | -2^63 to 2^63 - 1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) |
/// | float     | 32-bit   | Approx. ±3.40282347E+38F (6-7 significant decimal digits)  |
/// | double    | 64-bit   | Approx. ±1.79769313486231570E+308 (15 significant decimal digits) |
/// | char      | 16-bit   | 0 to 65,535 (Unsigned, represents Unicode characters)      |
/// | boolean   | N/A      | true or false                                              |
public class _03_Primitive_Types {

    public static void main(String[] args) {
        // byte: small integer value (-128 to 127)
        byte age = 30;

        // long: large integer value, ends with 'L' (useful for very large numbers)
        long viewsCount = 3_123_456_789L;

        // float: floating-point number, ends with 'F' (useful for decimals with less precision)
        float price = 10.99F;

        // char: single character, stored in single quotes ('A')
        char letter = 'A';

        // boolean: true or false value
        boolean isEligible = false;

        /*
         * Summary of Key Points:
         * - Primitive types are simple data types with fixed sizes in memory.
         * - Use 'byte', 'short', 'int', and 'long' for whole numbers of different sizes.
         * - Use 'float' and 'double' for numbers with decimal points (float is less precise).
         * - Use 'char' for single characters (Unicode).
         * - Use 'boolean' for true/false values.
         */
    }
}