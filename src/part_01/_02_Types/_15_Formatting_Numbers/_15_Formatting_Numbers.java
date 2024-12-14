package part_01._02_Types._15_Formatting_Numbers;

import java.text.NumberFormat;

public class _15_Formatting_Numbers {

	public static void main(String[] args) {

		// NumberFormat.getCurrencyInstance()
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println(currency.format(1.4));

		// NumberFormat.getPercentInstance()
		System.out.println(NumberFormat.getPercentInstance().format(0.1));
	}

}
