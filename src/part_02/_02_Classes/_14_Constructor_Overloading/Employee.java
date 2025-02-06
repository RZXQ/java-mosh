package part_02._02_Classes._14_Constructor_Overloading;

/*===============================================================================
 *                          Constructor Overloading
 *===============================================================================
 * - Allows multiple constructors with different parameter lists.
 * - Enables flexibility in object creation.
 * - One constructor can call another using `this()`.
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
	 * Constructor Overloading
	 * =============================================================================== -
	 * `Employee(int baseSalary)`: Calls `Employee(int baseSalary, int hourlyRate)`. -
	 * `Employee(int baseSalary, int hourlyRate)`: Initializes salary and rate.
	 */
	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}

	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
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

	private int getHourlyRate() {
		return hourlyRate;
	}

	/*
	 * ===============================================================================
	 * Hourly Rate Methods
	 * ===============================================================================
	 */
	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate < 0) {
			throw new IllegalArgumentException("Hourly rate cannot be negative.");
		}
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
