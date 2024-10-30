package part_03._06_Streams._7_Sorting_Streams;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("A", 10), new Movie("B", 15), new Movie("C", 20));

		// 1. Traditional sorting approach:
		// - This sorts movies by their titles in ascending order using a lambda
		// expression.
		// - The lambda (a, b) -> a.getTitle().compareTo(b.getTitle()) compares movie
		// titles.
		// movies.stream().sorted((a, b) ->
		// a.getTitle().compareTo(b.getTitle())).forEach(System.out::println);

		// 2. Simplified sorting with Comparator.comparing:
		// - Using Comparator.comparing() provides a cleaner way to sort by specific
		// properties.
		// - sorted(Comparator.comparing(Movie::getTitle)) sorts movies by title in
		// ascending order.
		movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(m -> System.out.println(m.getTitle())); // Prints
																														// movie
																														// titles
																														// in
																														// ascending
																														// order

		// 3. Sorting in reverse order:
		// - We can add .reversed() to reverse the order of the sorting criteria.
		// - sorted(Comparator.comparing(Movie::getTitle).reversed()) sorts titles in
		// descending order.
		movies.stream()
			.sorted(Comparator.comparing(Movie::getTitle).reversed())
			.forEach(m -> System.out.println(m.getTitle())); // Prints movie titles in
																// descending order
	}

}
