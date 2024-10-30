package part_03._06_Streams._14_Partitioning_Elements;

import java.util.List;
import java.util.stream.Collectors;

/// Partitioning Elements using Collectors.partitioningBy():
/// - partitioningBy() is used to divide elements in a stream into two groups based on a boolean condition.
/// - It creates a Map with two entries: one for elements that match the condition (true) and one for elements that don’t (false).
/// - Can be used alone or with other collectors (like mapping and joining) to customize the partitioned results.
///   Examples:
///   1. partitioningBy() with a predicate (e.g., m -> m.getLikes() > 20): Partitions elements into true and false groups based on the predicate.
///   2. partitioningBy() with a downstream collector: Further customizes each group, such as collecting titles into a comma-separated string.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10, Genre.THRILLER), new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION));

		// 1. Basic partitioning by likes
		// - Partitions movies based on whether their likes are greater than 20.
		// - Creates a Map<Boolean, List<Movie>> with two groups:
		// - true: movies with more than 20 likes
		// - false: movies with 20 likes or fewer.
		var result1 = movies.stream().collect(Collectors.partitioningBy(m -> m.getLikes() > 20));
		System.out.println(result1);

		// 2. Partitioning with a downstream collector (mapping and joining titles)
		// - Partitions movies by whether likes are greater than 20.
		// - For each partition, maps movies to their titles and joins the titles with a
		// comma.
		// - Creates a Map<Boolean, String> where:
		// - true: contains a comma-separated string of titles with more than 20 likes
		// - false: contains a comma-separated string of titles with 20 likes or fewer.
		var result2 = movies.stream()
			.collect(Collectors.partitioningBy(m -> m.getLikes() > 20,
					Collectors.mapping(Movie::getTitle, Collectors.joining(","))));
		System.out.println(result2);
	}

}
