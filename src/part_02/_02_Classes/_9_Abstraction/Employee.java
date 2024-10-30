package part_02._02_Classes._9_Abstraction;

public class Employee {

	private int baseSalary;

	private int hourlyRate;

	public void setBaseSalary(int salary) {
		if (baseSalary <= 0 ) {
			throw new IllegalArgumentException("Salary cannot be 0 or less.");
		}
		this.baseSalary = baseSalary;
	}

	// abstraction principal: changing from public modifier to private
	private int getBaseSalary() {
		return this.baseSalary;
	}
	
	// abstraction principal: changing from public modifier to private
	private int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		if (hourlyRate <= 0) {
			throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
		}
		this.hourlyRate = hourlyRate;
	}

	public int calculateWage(int extraHours) {
		return this.baseSalary + (this.hourlyRate * extraHours);
	}

}
