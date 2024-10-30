package part_03._06_Streams._4_Mapping_Elements;

import java.util.List;
import java.util.stream.Stream;

// 1. Using map() and mapTo... methods
// - map(): Transforms each element in the stream based on the given function and returns a new stream of those transformed elements.
// - mapToInt(), mapToDouble(), mapToLong(): Similar to map(), but returns a stream of primitive types (int, double, long), which can be useful for performance and special operations (like summing).

// 2. flatMap()
// - Used to flatten nested structures. Converts a Stream of collections (e.g., Stream<List<Integer>>) into a single Stream of individual elements (e.g., Stream<Integer>).
public class StreamsDemo {

	public static void show() {
		// 1. Demonstrating map() and mapToInt()
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		movies.stream()
			.map(movie -> movie.getTitle()) // Transforms each Movie object into its title
											// (String)
			.forEach(System.out::println); // Prints each title

		movies.stream()
			.mapToInt(Movie::getLikes) // Extracts 'likes' as int from each Movie and
										// returns IntStream
			.forEach(System.out::println); // Prints each 'likes' count

		// 2. Demonstrating flatMap()
		// Converts a Stream<List<Integer>> to Stream<Integer> by flattening each inner
		// list
		var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
		stream.flatMap(list -> list.stream()) // Converts each List<Integer> into
												// Stream<Integer>
			.forEach(System.out::println); // Prints each integer from flattened stream
	}

}
