package part_01._03_Control_Flow._03_Logical_Operators;

public class _03_Logical_Operators {

	public static void main(String[] args) {
		int temperature = 22;

		// logical and operator
		boolean isWarm = temperature > 20 && temperature < 30;
		System.out.println(isWarm);

		// logical or operator
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;

		// logical not operator
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);

	}

}
