package part_01._03_Control_Flow._03_Logical_Operators;

public class _03_Logical_Operators {

    public static void main(String[] args) {
        int temperature = 22;

        // 1. Logical AND (&&) Operator
        //    a. Evaluates to true if both conditions are true
        //    b. Checks if temperature is both greater than 20 AND less than 30
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); // Output: true (since 22 > 20 AND 22 < 30)

        // 2. Logical OR (||) Operator
        //    a. Evaluates to true if at least one of the conditions is true
        boolean hasHighIncome = true;    // Example condition
        boolean hasGoodCredit = true;    // Example condition
        boolean hasCriminalRecord = false;  // Example condition

        // 3. Logical NOT (!) Operator
        //    a. Negates the boolean value (true becomes false, false becomes true)
        //    b. Combined with OR and AND operators to check overall eligibility
        //    c. Eligible if hasHighIncome OR hasGoodCredit AND does NOT have a criminal record
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible); // Output: true (since true OR true AND not false is true)
    }

}

// Key Points:
// 1. Logical AND (&&): Requires both conditions to be true
// 2. Logical OR (||): Requires at least one condition to be true
// 3. Logical NOT (!): Inverts the boolean value
// 4. Combined use of logical operators enables complex condition checks in control flow