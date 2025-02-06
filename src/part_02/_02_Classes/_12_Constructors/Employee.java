package part_02._02_Classes._12_Constructors;

/*===============================================================================
 *                              Employee Class
 *===============================================================================
 * - Demonstrates constructors and field initialization in Java.
 * - If no constructor is defined, Java provides a default (no-arg) constructor.
 * - If any constructor is provided, the default constructor is not generated.
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

	public int getBaseSalary() {
		return baseSalary;
	}

	/*
	 * ===============================================================================
	 * Base Salary Methods
	 * ===============================================================================
	 */
	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0) {
			throw new IllegalArgumentException("Salary cannot be 0 or less.");
		}
		this.baseSalary = baseSalary;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	/*
	 * ===============================================================================
	 * Hourly Rate Methods
	 * ===============================================================================
	 */
	private void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/*
	 * ===============================================================================
	 * Wage Calculation
	 * ===============================================================================
	 */
	public int calculateWage(int extraHours) {
		return baseSalary + (hourlyRate * extraHours);
	}

}
