package part_03._02_Exceptions._2_What_are_Exceptions;

public class ExceptionsDemo {

    public static void show() {
        // 1. Demonstrates a NullPointerException
        // - Passing null to sayHello will cause an exception when attempting to call .toUpperCase() on a null
        //   reference.
        // - This example illustrates what happens when null values are not handled.
        sayHello(null);
    }

    public static void sayHello(String name) {
        // 2. Converts name to uppercase
        // - Assumes `name` is not null, so calling .toUpperCase() on a null
        //   input will cause a NullPointerException.
        System.out.println(name.toUpperCase());
    }
}