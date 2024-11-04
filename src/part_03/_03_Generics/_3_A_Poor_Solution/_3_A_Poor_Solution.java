package part_03._03_Generics._3_A_Poor_Solution;

public class _3_A_Poor_Solution {

    public static void main(String[] args) {
        var list = new List();

        // 1. Adding various types to the list (demonstrates potential problem with using Object)
        list.add(1); // Adding an Integer (autoboxed from int -> Integer)
        list.add("1"); // Adding a String
        list.add(new User()); // Adding a User object

        // 2. Attempting to retrieve and cast items from the list
        //    Problems occur due to lack of type safety with Object
        int number = (int) list.get(0);
        // ISSUE #1: Verbose and error-prone casting
        // - Since 'get()' returns an Object, we must manually cast it to the desired type (Integer here).
        // - This is verbose and clutters the code, making it harder to read.
        // - Also, if we forget the cast or do it incorrectly, it can lead to runtime errors.

        int number2 = (int) list.get(1);
        // ISSUE #2: Potential for ClassCastException at runtime
        // - Casting Object to an incorrect type (e.g., casting a String to an int here) causes ClassCastException.
        // - Errors like this are not caught at compile time; they only surface at runtime.
        // - This makes the code less reliable and can lead to hidden bugs if not carefully tested.
    }
}