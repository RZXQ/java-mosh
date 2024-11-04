package part_03._03_Generics._4_Generic_Classes;

public class _4_Generic_Classes {
    public static void main(String[] args) {
        // 1 - Benefit of Generics #1: Type Safety
        // Using generics enforces type constraints at compile-time, ensuring only Integer objects can be stored.
        var list = new GenericList<Integer>();

        // 2 - Adding Elements
        // This adds an Integer to the list. Generics ensure that no other types can be added accidentally.
        list.add(1);

        // 3 - Benefit of Generics #2: Eliminates Casting
        // No explicit cast is required when retrieving the value, making code cleaner and safer.
        int number = list.get(0);

        // 4 - Example with a different type
        // Creating another GenericList, this time for storing User objects
        var list2 = new GenericList<User>();

        // 5 - Adding a User object to the list
        list2.add(new User());

        // 6 - Retrieving a User Object with Type Safety
        // Here, we get a User object directly without casting.
        User user = list2.get(0);
    }
}