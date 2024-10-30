package part_02._05_Interfaces._9_Interface_Segregation_Principle;

/// The Interface Segregation Principle (ISP) aims at creating
/// interfaces that are specifically tailored to client needs,
/// rather than forcing clients to implement methods they don't use.
/// This principle promotes the design of more focused and cohesive interfaces,
/// but it doesn't mean each interface must have only one method.
/// Instead, it means an interface should have a set of related methods
/// that make sense together.
public interface Resizable {

	void resize(int size);

	void resize(int x, int y);

}