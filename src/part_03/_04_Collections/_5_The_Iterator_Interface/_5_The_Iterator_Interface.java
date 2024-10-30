package part_03._04_Collections._5_The_Iterator_Interface;

public class _5_The_Iterator_Interface {

	public static void main(String[] args) {
		var list = new GenericList<String>();
		list.add("a");
		list.add("b");
		list.add("c");

		var iterator = list.iterator();

		while (iterator.hasNext()) {
			var current = iterator.next();
			System.out.println(current);
		}

		for (var item : list) {
			System.out.println(item);
		}
	}

}