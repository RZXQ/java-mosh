package part_03._06_Streams._12_Collectors;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/// Collectors:
/// - The Collectors class provides methods to transform a stream into various collections or summary results.
/// - Common uses include transforming data into lists, sets, maps, or computing summaries like sums and averages.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		// 1. Collecting to a List
		// - Collectors.toList() collects stream elements into a List.
		// - Here, it gathers movies with likes > 10 into a List.
		var result1 = movies.stream()
			.filter(m -> m.getLikes() > 10) // Filters movies with more than 10 likes
			.collect(Collectors.toList()); // Collects the filtered movies into a List

		// 2. Collecting to a Set
		// - Collectors.toSet() collects stream elements into a Set.
		// - Here, it gathers movies with likes > 10 into a Set (no duplicate elements
		// allowed).
		var result2 = movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toSet()); // Collects
																									// the
																									// filtered
																									// movies
																									// into
																									// a
																									// Set

		// 3. Collecting to a Map
		// - Collectors.toMap() collects stream elements into a Map.
		// - Here, the key is the movie title, and the value is the movie object itself.
		// - Function.identity() returns each movie object as the value in the Map.
		var result3 = movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.toMap(Movie::getTitle, // The key for each entry (movie
														// title)
					Function.identity())); // The value for each entry (the movie object
											// itself)

		// 4. Summing Values
		// - Collectors.summingInt() calculates the sum of integers in the stream.
		// - Here, it sums the 'likes' of all movies with likes > 10.
		var result4 = movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.summingInt(Movie::getLikes)); // Sums
																														// up
																														// the
																														// likes
																														// of
																														// filtered
																														// movies

		// 5. Generating Summary Statistics
		// - Collectors.summarizingInt() provides various statistics (count, sum, min,
		// average, max).
		// - Here, it summarizes the likes for movies with likes > 10.
		var result6 = movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.summarizingInt(Movie::getLikes)); // Produces summary
																	// stats for likes

		// 6. Joining Elements with a Delimiter
		// - Collectors.joining() combines strings in the stream into a single string
		// with a separator.
		// - Here, it joins movie titles with a comma between them.
		var result7 = movies.stream()
			.filter(m -> m.getLikes() > 10) // Filters movies with more than 10 likes
			.map(Movie::getTitle) // Maps each movie to its title
			.collect(Collectors.joining(",")); // Joins titles with a comma between them

		// Printing the result of the joined titles
		System.out.println(result7);
	}

}
