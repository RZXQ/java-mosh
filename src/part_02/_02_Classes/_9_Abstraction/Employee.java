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
 * ===============================================================================
 */
abstract class Employee implements Workable {

	private final String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

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

}
