package part_03._06_Streams._13_Grouping_Elements;

import java.util.List;
import java.util.stream.Collectors;

/// Grouping Elements using Collectors:
/// 1. groupingBy(classifier): Groups elements by a classifier function.
/// 2. groupingBy(classifier, downstream): Applies a downstream collector to each group.
/// 3. groupingBy(classifier, mapping): Transforms each group using a mapping function.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10, Genre.THRILLER), new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION));

		// 1. Group movies by genre
		System.out.println(movies.stream().collect(Collectors.groupingBy(Movie::getGenre)));

		// 2. Group by genre and collect as a Set
		System.out.println(movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet())));

		// 3. Group by genre and count movies in each group
		System.out.println(movies.stream().collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting())));

		// 4. Group by genre and collect movie titles as a comma-separated string
		System.out.println(movies.stream()
			.collect(Collectors.groupingBy(Movie::getGenre,
					Collectors.mapping(Movie::getTitle, Collectors.joining(", ")))));
	}

}
