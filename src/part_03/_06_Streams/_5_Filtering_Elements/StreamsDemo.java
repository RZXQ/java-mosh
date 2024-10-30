package part_03._06_Streams._5_Filtering_Elements;

import java.util.List;
import java.util.function.Predicate;

/// Stream methods fall into two categories:
/// 1. Intermediate operations: Operations that return a stream and can be chained.
/// - map(): Transforms each element in the stream.
/// - filter(): Filters elements based on a given condition.
///
/// 2. Terminal operations: Operations that produce a result or action.
/// - forEach(): Performs an action on each element in the stream, such as printing them.
public class StreamsDemo {

	public static void show() {
		// Create a list of movies with title and likes
		var movies = List.of(new Movie("a", 10), // Movie with title "a" and 10 likes
				new Movie("b", 20), // Movie with title "b" and 20 likes
				new Movie("c", 30) // Movie with title "c" and 30 likes
		);

		// Define a predicate (condition) to check if a movie is popular
		Predicate<Movie> isPopular = m -> m.getLikes() > 10;

		// Use the stream() method to create a stream of movies, filter them based on the
		// predicate, and print the title of each popular movie.
		movies.stream()
			.filter(isPopular) // Intermediate operation: keep movies with likes > 10
			.forEach(m -> System.out.println(m.getTitle())); // Terminal operation: print
																// each popular movie's
																// title
	}

}