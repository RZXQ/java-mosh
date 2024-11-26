package part_03._06_Streams._6_Slicing_Streams;

import java.util.List;

/// Demonstrates slicing operations in Stream API.
/// 1. limit(N): Limits the stream to N elements.
/// 2. skip(N): Skips the first N elements.
/// 3. takeWhile(cond): Takes elements while the condition is true.
///    - Works only on ordered streams.
/// 4. dropWhile(cond): Drops elements while the condition is true, takes the rest.
///    - Works only on ordered streams.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 30), new Movie("c", 20));

		// 1. limit: Limit the stream to 3 elements and print their titles
		movies.stream().limit(3).forEach(m -> System.out.println(m.getTitle()));

		// 2. skip: Skip the first 20 movies and limit the result to 10 movies
		// Useful for pagination: skip((page - 1) * movies per page)
		movies.stream().skip(20).limit(10).forEach(m -> System.out.println(m.getTitle()));

		// 3. takeWhile: Take movies while their likes are < 30, stops at first false
		movies.stream().takeWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle()));

		// 4. filter: Filter movies by likes < 30 (checks entire stream)
		movies.stream().filter(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle()));

		// 5. dropWhile: Drop movies while their likes are < 30, take the rest
		movies.stream().dropWhile(m -> m.getLikes() < 30).forEach(m -> System.out.println(m.getTitle()));
	}

}