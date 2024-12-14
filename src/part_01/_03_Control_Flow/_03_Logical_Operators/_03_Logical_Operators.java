package part_01._03_Control_Flow._03_Logical_Operators;

public class _03_Logical_Operators {

	public static void main(String[] args) {
		int temperature = 22;

		// 1. Logical AND (&&) Operator
		boolean isWarm = temperature > 20 && temperature < 30;

		// 2. Logical OR (||) Operator
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;

		// 3. Logical NOT (!) Operator
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
	}

}