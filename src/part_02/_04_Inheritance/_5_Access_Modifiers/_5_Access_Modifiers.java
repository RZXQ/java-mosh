package part_02._04_Inheritance._5_Access_Modifiers;

/// 1. The private fields in the parent class do get inherited by the child class, but they are not directly accessible or visible to the child class. You can think of the private fields as part of the internal state of the parent class that the child class cannot directly access or modify. However, the child class can interact with these private fields through public or protected methods provided by the parent class.
///
/// 2. Java Access Modifiers Comparison
///
/// | Modifier                  | Same Class | Same Package | Subclass (Same Package) | Subclass (Different Package) | Everywhere |
/// |---------------------------|------------|--------------|-------------------------|------------------------------|------------|
/// | **public**                | ✔          | ✔            | ✔                       | ✔                            | ✔          |
/// | **protected**             | ✔          | ✔            | ✔                       | ✔                            | ✘          |
/// | **default** (no modifier) | ✔          | ✔            | ✔                       | ✘                            | ✘          |
/// | **private**               | ✔          | ✘            | ✘                       | ✘                            | ✘          |
///
/// 3. Mosh: just stick to the public and private modifiers and avoid using default and protected modifiers
public class _5_Access_Modifiers {

	public static void main(String[] args) {

	}

}
