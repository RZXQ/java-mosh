package part_01._02_Types._07_Escape_Sequences;

public class _07_Escape_Sequences {
    public static void main(String[] args) {
        // 1. Displaying double quotes within a string
        System.out.println("Hello \"Ruizhi\""); // Output: Hello "Ruizhi"

        // 2. Displaying a file path with backslashes
        System.out.println("c:\\Windows\\..."); // Output: c:\Windows\...

        // 3. Inserting a new line
        System.out.println("Hello\nWorld"); // \n moves the cursor to the next line

        // 4. Adding a horizontal tab space
        System.out.println("Hello\tWorld"); // \t adds a tab space within the string

        /*
         * Key Escape Sequences:
         * - \"  : Inserts double quotes within a string.
         * - \\  : Inserts a single backslash.
         * - \n  : Moves to a new line.
         * - \t  : Adds a horizontal tab space.
         *
         * Usage:
         * - Escape sequences are used to include special characters in strings, which otherwise have
         *   special meanings in Java (e.g., double quotes and backslashes).
         */
    }
}