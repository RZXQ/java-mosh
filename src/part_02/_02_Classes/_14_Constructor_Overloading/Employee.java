package part_02._02_Classes._14_Constructor_Overloading;

public class Employee {

	private int baseSalary;

	private int hourlyRate;

	// constructor overloading
	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}

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

	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate < 0) {
			throw new IllegalArgumentException("Hourly rate cannot be negative.");
		}
		this.hourlyRate = hourlyRate;
	}

	private int getHourlyRate() {
		return hourlyRate;
	}

	public int calculateWage() {
		return calculateWage(0);
	}

	public int calculateWage(int extraHours) {
		return baseSalary + (getHourlyRate() * extraHours);
	}

}
