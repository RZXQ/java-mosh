package part_03._06_Streams._11_Reducing_a_Stream;

import java.util.List;

/// This class demonstrates two ways to sum the likes of movies using streams:
/// 1) Using `reduce` without an identity and handling the Optional result.
/// 2) Using `reduce` with an identity to avoid dealing with Optional.
public class StreamsDemo {

	public static void show() {
		// List<Movie> movies = List.of(); // Uncomment for an empty movies list
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		// 1. Reduce without identity. Optional handles potential empty list.
		System.out.println(movies.stream().map(Movie::getLikes).reduce(Integer::sum).orElse(0));

		// 2. Reduce with identity. No Optional handling needed.
		System.out.println(movies.stream().map(Movie::getLikes).reduce(0, Integer::sum));
	}

	public static void main(String[] args) {
		show();
	}

}