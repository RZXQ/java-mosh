package part_02._02_Classes._13_Method_Overloading;

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

	public int calculateWage() {
		return calculateWage(0);
	}

	public int calculateWage(int extraHours) {
		return baseSalary + (getHourlyRate()* extraHours);
	}

}
