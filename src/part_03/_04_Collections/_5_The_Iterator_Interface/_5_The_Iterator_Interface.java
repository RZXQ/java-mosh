package part_03._04_Collections._5_The_Iterator_Interface;

public class _5_The_Iterator_Interface {

	public static void main(String[] args) {
		var list = new GenericList<String>();
		list.add("a");
		list.add("b");
		list.add("c");

		// iterator.hasNext() & iterator.next():
		var iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// enhanced for loop:
		for (var item : list) {
			System.out.println(item);
		}

	}

}