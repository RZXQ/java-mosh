package part_02._02_Classes._6_Procedural_Programming;

public class _6_Procedural_Programming {

	public static void main(String[] args) {
		int baseSalary = 50_000;
		int extraHours = 10;
		int hourlyRate = 20;

		int wage = calculateWage(baseSalary, extraHours, hourlyRate);
		System.out.println(wage);
	}

	public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
		return baseSalary + (extraHours * hourlyRate);
	}

}
