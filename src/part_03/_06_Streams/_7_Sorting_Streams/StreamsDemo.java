package part_03._06_Streams._7_Sorting_Streams;

import java.util.Comparator;
import java.util.List;

/// This class demonstrates sorting streams of Movie objects
/// using different approaches:
/// 1. Using a lambda expression in the sorted() method.
/// 2. Using Comparator.comparing() for ascending and descending order.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("b", 10), new Movie("a", 20), new Movie("c", 30));

		// 1. sorted(): use lambda to sort by title
		movies.stream()
			.sorted((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()))
			.forEach(m -> System.out.println(m.getTitle()));

		// 2. Comparator.comparing():
		// 2.1 Ascending order
		movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(m -> System.out.println(m.getTitle()));

		// 2.2 Descending order
		movies.stream()
			.sorted(Comparator.comparing(Movie::getTitle).reversed())
			.forEach(m -> System.out.println(m.getTitle()));
	}

}