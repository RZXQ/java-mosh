package part_03._03_Generics._2_The_Need_for_Generics;

// This class illustrates why generics are useful in Java.
// Without generics, we need separate classes for each data type (e.g., List for integers, UserList for User objects).
// Generics allow us to create a single class that can work with different data types.
public class _2_The_Need_for_Generics {
    public static void main(String[] args) {
        // Example: Using a non-generic List class, only integers can be added.
        // With generics, we could define a single List<T> that works with any data type.
        var list = new List();
        list.add(1); // Works for integers, but not flexible for other data types.
    }
}