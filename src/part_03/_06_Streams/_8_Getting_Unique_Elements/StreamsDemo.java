package part_03._06_Streams._8_Getting_Unique_Elements;

import java.util.List;

/// Demonstrates using streams to get unique elements from a list
/// using the distinct() method.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 10), new Movie("c", 20), new Movie("d", 30));

		// 1. distinct(): get unique likes
		movies.stream().map(Movie::getLikes).distinct().forEach(System.out::println);
	}

}