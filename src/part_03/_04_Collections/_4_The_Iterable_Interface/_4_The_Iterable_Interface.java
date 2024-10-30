package part_03._04_Collections._4_The_Iterable_Interface;

public class _4_The_Iterable_Interface {

	///
	/// **Iterators in Java**
	///
	/// An iterator allows you to traverse through the elements of a collection.
	/// It lets you process each element in the list one-by-one without needing
	/// to know the internal structure of the list.
	///
	/// **For each loop**
	///
	/// If you view the bytecode for this, you will see that the enhanced for loop
	/// (also known as for-each loop) is just a shorthand. Internally, it uses
	/// an Iterator to go through the elements of the list.
	///
	public static void main(String[] args) {
		var list = new GenericList<String>();
		var iterator = list.iterator();

		// iterator.hasNext()
		while (iterator.hasNext()) {
			var current = iterator.next();
			System.out.println(current);
		}

		// enhanced for loop
		for (var item : list) {
			System.out.println(item);
		}
	}

}