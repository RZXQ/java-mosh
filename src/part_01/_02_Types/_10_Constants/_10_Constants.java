package part_01._02_Types._10_Constants;

/// Explanation of 'final':
/// - 'final' ensures that the value cannot be modified after initialization.
/// - A local constant (e.g., inside a method) is accessible only within that method.
/// - Each time the method is invoked, a new instance of the constant is created in memory.
/// - For better memory efficiency and global access, use 'static final' at the class level.
public class _10_Constants {

	public static void main(String[] args) {
		// Example of a local constant
		final float PI = 3.14F;

		System.out.println("Local constant PI: " + PI);
	}

}
