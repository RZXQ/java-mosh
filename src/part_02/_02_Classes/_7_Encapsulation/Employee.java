package part_02._02_Classes._7_Encapsulation;

/*===============================================================================
 *                               Encapsulation in Action
 *===============================================================================
 * | Principle                   | Implementation                              |
 * |-----------------------------|---------------------------------------------|
 * | Data Hiding                 | `private int salary;` and `private int hourlyRate;` |
 * | Controlled Access            | Public getters and setters                  |
 * | Data Validation              | Setters prevent invalid values              |
 * | Encapsulated Behavior        | `calculateWage()` operates on private data  |
 * | Restricted Direct Access     | Fields are accessible only via methods      |
 *===============================================================================
 */

public class Employee {

	/*
	 * ===============================================================================
	 * Private Fields
	 * ===============================================================================
	 */
	private int salary;

	private int hourlyRate;

	/*
	 * ===============================================================================
	 * Getters and Setters
	 * ===============================================================================
	 */
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary <= 0) {
			throw new IllegalArgumentException("Salary must be greater than 0.");
		}
		this.salary = salary;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		if (hourlyRate <= 0) {
			throw new IllegalArgumentException("Hourly rate must be positive.");
		}
		this.hourlyRate = hourlyRate;
	}

	/*
	 * ===============================================================================
	 * Encapsulated Behavior
	 * ===============================================================================
	 */
	public int calculateWage(int extraHours) {
		return salary + (hourlyRate * extraHours);
	}

}
