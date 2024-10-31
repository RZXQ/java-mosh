package part_01._02_Types._14_The_Math_Class;

public class _14_The_Math_Class {
    public static void main(String[] args) {
        // 1. Rounding a float value
        // - Math.round() rounds the float value to the nearest integer.
        // - Here, 1.1F is closer to 1 than to 2, so it returns 1.
        int roundedResult = Math.round(1.1F);
        System.out.println(roundedResult);

        // 2. Ceiling of a float value
        // - Math.ceil() returns the smallest integer greater than or equal to the value.
        // - Here, 1.1F rounds up to 2.0.
        double ceilResult = Math.ceil(1.1F);
        System.out.println(ceilResult);

        // 3. Floor of a float value
        // - Math.floor() returns the largest integer less than or equal to the value.
        // - Here, 1.1F rounds down to 1.0.
        double floorResult = Math.floor(1.1F);
        System.out.println(floorResult);

        // 4. Maximum of two integers
        // - Math.max() returns the greater of two values.
        // - Between 1 and 2, it returns 2.
        int maxResult = Math.max(1, 2);
        System.out.println(maxResult);

        // 5. Minimum of two integers
        // - Math.min() returns the smaller of two values.
        // - Between 1 and 2, it returns 1.
        int minResult = Math.min(1, 2);
        System.out.println(minResult);

        // 6. Generating a random integer between 0 and 100
        // - Math.random() generates a random double between 0.0 and 1.0.
        // - Multiplying by 100 scales this to 0.0 - 100.0, and Math.round() rounds it to the nearest integer.
        // - Casting to int gives a final integer result.
        int randomResult = (int) Math.round(Math.random() * 100);
        System.out.println(randomResult);
    }
}