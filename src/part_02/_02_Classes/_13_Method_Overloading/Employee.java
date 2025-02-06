package part_02._02_Classes._13_Method_Overloading;

/*===============================================================================
 *                           Method Overloading
 *===============================================================================
 * - Allows multiple methods with the same name but different parameter lists.
 * - Parameters must differ in:
 *   1. Number of parameters.
 *   2. Type of parameters.
 *   3. Order of parameters.
 * - Return type alone cannot be used for overloading.
 */

public class Employee {

	/*
	 * ===============================================================================
	 * Fields
	 * ===============================================================================
	 */
	private int baseSalary;

	private int hourlyRate;

	/*
	 * ===============================================================================
	 * Constructor
	 * ===============================================================================
	 */
	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
	}

	/*
	 * ===============================================================================
	 * Base Salary Methods
	 * ===============================================================================
	 */
	public int getBaseSalary() {
		return baseSalary;
	}

	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0) {
			throw new IllegalArgumentException("Salary cannot be 0 or less.");
		}
		this.baseSalary = baseSalary;
	}

	/*
	 * ===============================================================================
	 * Hourly Rate Methods
	 * ===============================================================================
	 */
	public int getHourlyRate() {
		return hourlyRate;
	}

	private void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/*
	 * ===============================================================================
	 * Wage Calculation
	 * =============================================================================== -
	 */
	public int calculateWage() {
		return calculateWage(0);
	}

	public int calculateWage(int extraHours) {
		return baseSalary + (getHourlyRate() * extraHours);
	}

}
