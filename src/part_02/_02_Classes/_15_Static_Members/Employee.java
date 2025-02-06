package part_02._02_Classes._15_Static_Members;

/*===============================================================================
 *                                Static Members
 *===============================================================================
 * - `static` fields and methods belong to the **class itself**, not instances.
 * - **Static Field (Only One Copy Exists!)**:
 *   - Shared across **all instances** of the class.
 *   - No matter how many objects are created, **only one copy** of a static field exists.
 * - **Static Method (Only One Copy Exists!)**:
 *   - A single copy exists for the entire class.
 *   - Can only access static fields and cannot use `this`.
 * - **Instance Members (Fields & Methods)**:
 *   - Each object has its own separate copy.
 *   - Can access both instance fields and methods.
 */

public class Employee {

	private static int numberOfEmployees; // One copy shared by all Employee instances.

	/*
	 * ===============================================================================
	 * Fields
	 * =============================================================================== -
	 */
	private int baseSalary;

	private int hourlyRate;

	/*
	 * ===============================================================================
	 * Constructors
	 * =============================================================================== -
	 */
	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}

	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		numberOfEmployees++; // Updates the single shared static field.
	}

	/*
	 * ===============================================================================
	 * Static Methods (Only One Copy!)
	 * =============================================================================== -
	 */
	public static void printNumberOfEmployees() {
		System.out.println("Total Employees: " + numberOfEmployees);
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
