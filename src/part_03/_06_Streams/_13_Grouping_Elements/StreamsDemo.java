package part_03._06_Streams._13_Grouping_Elements;

import java.util.List;
import java.util.stream.Collectors;

/// Grouping Elements using Collectors:
/// - Collectors.groupingBy() allows us to group stream elements based on a classifier (e.g., genre).
/// - It can be combined with other collectors like toSet(), counting(), and mapping() to customize the grouped results.
///   Common examples:
///   1. groupingBy() with a classifier (e.g., Movie::getGenre): Groups elements by a certain field or property.
///   2. groupingBy() with a downstream collector (e.g., Collectors.toSet() or Collectors.counting()): Customizes how each group is stored.
///   3. groupingBy() with mapping(): Transforms each group by applying a function (e.g., getTitle) and collecting results (e.g., joining them into a string).
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10, Genre.THRILLER), new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION));

		// 1. Basic grouping by genre
		// - Groups movies by their genre, resulting in a Map<Genre, List<Movie>>.
		// var result = movies.stream().collect(Collectors.groupingBy(Movie::getGenre));

		// 2. Grouping by genre with toSet()
		// - Groups movies by genre but collects each group into a Set instead of a List
		// to avoid duplicates.
		// var result = movies.stream().collect(Collectors.groupingBy(Movie::getGenre,
		// Collectors.toSet()));

		// 3. Grouping by genre with counting()
		// - Groups movies by genre and counts the number of movies in each genre,
		// resulting in a Map<Genre, Long>.
		// var result = movies.stream().collect(Collectors.groupingBy(Movie::getGenre,
		// Collectors.counting()));

		// 4. Grouping by genre with mapping() and joining()
		// - Groups movies by genre, maps each movie to its title, and joins titles in
		// each group with commas.
		// - This results in a Map<Genre, String> where the genre is the key and the
		// titles are joined in a single string.
		var result = movies.stream()
			.collect(Collectors.groupingBy(Movie::getGenre, // Groups by genre
					Collectors.mapping(Movie::getTitle, Collectors.joining(",")) // Maps
																					// each
																					// movie
																					// to
																					// its
																					// title
																					// and
																					// joins
																					// titles
																					// with
																					// a
																					// comma
			));

		System.out.println(result);
	}

}
