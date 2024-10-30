package part_03._06_Streams._2_Imperative_vs_Functional_Programming;

import java.util.List;

/// Different Ways of Programming:
/// 1. Imperative Programming: Focuses on how to do tasks step-by-step
/// 2. Declarative Programming: Focuses on what tasks need to be done, like SQL queries
///
/// Streams: Used to handle data collections in a clear and concise way
public class StreamsDemo {

	public static void show() {
		List<Movie> movies = List.of(new Movie("A", 10), new Movie("B", 15), new Movie("C", 20));

		// Imperative Programming: Specifying each step to get a result
		int count = 0;
		for (var movie : movies) {
			if (movie.getLikes() > 10) {
				count++;
			}
		}

		// Declarative Programming: Stream API (Functional programming)
		// In Java, every collection has a stream() method which returns a series of
		// objects that can be processed in a pipeline
		// Predicate<Movie> predicate = movie -> movie.getLikes() > 10;
		var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
		System.out.println(count2);
	}

}