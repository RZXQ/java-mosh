package part_03._06_Streams._5_Filtering_Elements;

import java.util.List;

/// Demonstrates the use of Stream API.
/// 1. Intermediate operations: return a stream, can be chained.
///    - map(): Transforms each element.
///    - filter(): Filters elements based on a condition.
/// 2. Terminal operations: produce a result or action.
///    - forEach(): Performs an action such as printing.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		// Filter movies with likes greater than 10 and print their titles
		movies.stream().filter(m -> m.getLikes() > 10).forEach(m -> System.out.println(m.getTitle()));
	}

}