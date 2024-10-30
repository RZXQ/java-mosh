package part_02._02_Classes._15_Static_Members;

public class Employee {

	private int baseSalary;

	private int hourlyRate;

	public static int numberOfEmployees;

	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}

	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		numberOfEmployees++;
	}
	
	public static void printNumberOfEmployees() {
		System.out.println(numberOfEmployees);
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
