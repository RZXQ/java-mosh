package part_02._03_Refactoring_Towards_an_Object_oriented_Design._5_Overloading_Methods;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in); // using private because scanner object is used internally
    // inside this class

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    // Why using static ? because we don't have multiple consoles, it's better to use static
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

}