package part_02._02_Classes._12_Constructors;

/// 1. Default constructor: If no constructor is provided by the programmer, Java automatically generates a default (no-argument) constructor. This default constructor initializes fields to their default values (e.g., 0 for int, null for Object).
/// 2. If any constructors are provided: Java will not generate the default (no-argument) constructor.
public class Employee {

	private int baseSalary;

	private int hourlyRate;

	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
	}

	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0) {
			throw new IllegalArgumentException("Salary cannot be 0 or less.");
		}
		this.baseSalary = baseSalary;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	private void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public int calculateWage(int extraHours) {
		return baseSalary + (hourlyRate * extraHours);
	}

}
