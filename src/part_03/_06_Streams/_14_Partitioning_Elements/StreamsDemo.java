package part_03._06_Streams._14_Partitioning_Elements;

import java.util.List;
import java.util.stream.Collectors;

/// Demonstrates partitioning elements using Streams.
/// Essential Points:
/// 1. `partitioningBy(predicate)`: Splits elements into two groups based on a predicate.
/// 2. `Collectors.mapping()`: Applies a mapping function to each element in the partitions.
/// 3. `Collectors.joining()`: Joins the mapped elements into a single `String`.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10, Genre.THRILLER), new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION));

		System.out.println(movies.stream()
			// Partition movies based on likes > 20
			.collect(Collectors.partitioningBy(m -> m.getLikes() > 20,
					Collectors.mapping(Movie::getTitle, Collectors.joining(", ")))));
	}

}
