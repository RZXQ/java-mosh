package part_01._02_Types._15_Formatting_Numbers;

import java.text.NumberFormat;

public class _15_Formatting_Numbers {

    public static void main(String[] args) {
        // 1. Formatting as Currency
        // - NumberFormat.getCurrencyInstance() is a factory method that returns a NumberFormat object for formatting numbers as currency.
        // - This method is useful when you want to display numbers with currency symbols, commas, and decimal points (e.g., $1.40).
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1.4)); // Formats 1.4 as currency (e.g., "$1.40")

        // 2. Formatting as Percentage
        // - NumberFormat.getPercentInstance() is another factory method that returns a NumberFormat object for formatting numbers as percentages.
        // - The format method automatically multiplies the number by 100 and appends a % symbol.
        // - Method chaining is used here to directly call format on the returned object.
        System.out.println(NumberFormat.getPercentInstance().format(0.1)); // Formats 0.1 as "10%"
    }
}