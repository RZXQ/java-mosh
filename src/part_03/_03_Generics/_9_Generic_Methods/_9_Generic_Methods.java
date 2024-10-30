package part_03._03_Generics._9_Generic_Methods;

public class _9_Generic_Methods {

	public static void main(String[] args) {
		System.out.println(Utils.max(1, 3));
		System.out.println(Utils.max(new User(10), new User(20)));
	}

}
