package part_03._03_Generics._6_Constraints;

// T extends Number is used to define a generic type parameter for classes or methods.
// ? extends Number is used in method parameters or return types, representing an unknown subclass of Number.
public class GenericList<T extends Comparable & Cloneable> {

	// Bounded type parameter with multiple bounds

	// Note: new GenericList can only be Number or its subclasses
	// Example syntax for a bounded type: public class GenericList<T extends Number> { ...
	// }

	private final T[] list = (T[]) new Object[10];

	private int count;

	public void add(T item) {
		this.list[this.count++] = item;
	}

	public T get(int index) {
		return this.list[index];
	}

}