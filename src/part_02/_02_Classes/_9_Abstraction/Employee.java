package part_02._02_Classes._9_Abstraction;

/*===============================================================================
 *                              Abstraction in OOP
 *===============================================================================
 * - Hides implementation details, exposing only essential features.
 * - Provides a simplified interface while keeping complex logic hidden.
 ===============================================================================*/

/*===============================================================================
 *                          Work Behavior Interface (Abstraction)
 *===============================================================================*/
interface Workable {

	void work(); // Defines an abstract work behavior

}

/*
 * ===============================================================================
 * Abstract Employee Class (Abstraction)
 * =============================================================================== -
 * Implements Workable interface. - Defines an abstract method for getting employment
 * type. ===============================================================================
 */
abstract class Employee implements Workable {

	private final String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Abstract method to be implemented by subclasses
	public abstract String getEmploymentType();

}

/*
 * ===============================================================================
 * Full-Time Employee Implementation
 * ===============================================================================
 */
class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(getName() + " works full-time.");
	}

	@Override
	public String getEmploymentType() {
		return "Full-Time";
	}

}

/*
 * ===============================================================================
 * Part-Time Employee Implementation
 * ===============================================================================
 */
class PartTimeEmployee extends Employee {

	public PartTimeEmployee(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(getName() + " works part-time.");
	}

	@Override
	public String getEmploymentType() {
		return "Part-Time";
	}

}
