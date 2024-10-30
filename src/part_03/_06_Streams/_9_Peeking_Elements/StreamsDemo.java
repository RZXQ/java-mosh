package part_03._06_Streams._9_Peeking_Elements;

import java.util.List;

/// Demonstrating two ways to view elements in a stream:
/// 1. Traditional approach using filter and map directly to process and print titles.
///    - filter() to select movies with likes > 10.
///    - map() to get movie titles.
///    - forEach() as the terminal operation to print each title.
///
/// 2. Using the peek() method:
///    - peek() allows us to view elements at different stages in the stream without ending the stream.
///    - Useful for debugging or understanding what data flows through each stage of the stream.
///    - Unlike forEach(), peek() is an intermediate operation, so we can still perform additional operations after using it.
public class StreamsDemo {

	public static void show() {
		// 1. Traditional approach to view titles for each movie with likes > 10
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));
		movies.stream()
			.filter(m -> m.getLikes() > 10) // Filters movies with likes greater than 10
			.map(Movie::getTitle) // Maps each filtered movie to its title
			.forEach(System.out::println); // Prints each title

		// 2. Using peek() to view intermediate elements in the stream
		// - First peek() logs after filtering, showing which movies passed the filter
		// - Second peek() logs after mapping, showing which titles are being processed
		movies.stream()
			.filter(m -> m.getLikes() > 10) // Filters movies with likes greater than 10
			.peek(m -> System.out.println("filtered: " + m.getTitle())) // Logs titles of
																		// filtered movies
			.map(Movie::getTitle) // Maps each movie to its title
			.peek(m -> System.out.println("mapped: " + m)) // Logs each title after
															// mapping
			.forEach(System.out::println); // Prints each title as the final operation
	}

}
