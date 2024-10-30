package part_02._05_Interfaces._4_Creating_an_Interface;

/// ## why public modifier is redundant?
///
/// In Java, all methods declared within an interface are implicitly public and abstract, even if you don't explicitly specify these modifiers. This means that including the public keyword is not strictly necessary, but it's often done for clarity and readability.
/// Here's your code with the redundant public keyword removed:
public interface TaxCalculator {

	double calculateTax();

}
