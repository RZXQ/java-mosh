package part_02._02_Classes._6_Procedural_Programming;

/*===============================================================================
 *                        Procedural Programming vs OOP
 *===============================================================================
 * Key Characteristics of Procedural Programming:
 * 1. Focuses on functions (procedures) and the sequence of steps to solve a problem.
 * 2. Data and logic are separate: functions operate on external data.
 * 3. Code is organized into procedures, not objects or classes.
 * 4. Less modular and reusable compared to OOP, where data and behavior are encapsulated in objects.
 */

public class _6_Procedural_Programming {

	public static void main(String[] args) {
		int baseSalary = 50_000;
		int extraHours = 10;
		int hourlyRate = 20;

		/*
		 * ===============================================================================
		 * Calculate Wage Procedure
		 * ===============================================================================
		 */
		int wage = calculateWage(baseSalary, extraHours, hourlyRate);
		System.out.println(wage);
	}

	public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
		return baseSalary + (extraHours * hourlyRate);
	}

}
