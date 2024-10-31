package part_01._02_Types._06_Strings;

public class _06_Strings {

    public static void main(String[] args) {
        // 1. Initialize a String variable with concatenation
        String message = "  Hello World" + "!!  ";
        System.out.println(message); // Output: "  Hello World!!  "

        // 2. Check if the string starts or ends with certain characters
        System.out.println(message.startsWith("!!")); // Checks if message starts with "!!" (returns false)
        System.out.println(message.endsWith("!!"));   // Checks if message ends with "!!" (returns true)

        // 3. Get the length of the string and find the index of a substring
        System.out.println(message.length());         // Returns the length of message (e.g., 15)
        System.out.println(message.indexOf("sky"));   // Returns -1 because "sky" is not in message

        // 4. Replace characters in the string
        System.out.println(message.replace("!", "*")); // Replaces "!" with "*" and returns a new string

        // Note: 'replaceAll' requires a regular expression as the first argument
        System.out.println(message.replaceAll("!", "*")); // also returns a new string

        // 5. Demonstrate immutability of strings and transformations
        System.out.println(message);                // Prints original message, demonstrating immutability
        System.out.println(message.toLowerCase());  // Converts the string to lowercase and returns a new string
        System.out.println(message.toUpperCase());  // Converts the string to uppercase and returns a new string
        System.out.println(message.trim());         // Removes leading and trailing spaces and returns a new string

        /*
         * Key Points:
         * - Strings in Java are immutable, meaning once created, their values cannot be changed.
         * - Any method that seems to "modify" a string (e.g., `toLowerCase`, `toUpperCase`, `trim`, `replace`, `replaceAll`)
         *   actually returns a new string with the modifications, leaving the original string unchanged.
         * - `length` returns the total number of characters in the string.
         * - `startsWith` and `endsWith` check if a string begins or ends with a specific sequence.
         */
    }
}