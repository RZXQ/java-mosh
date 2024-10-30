package part_03._06_Streams._11_Reducing_a_Stream;

import java.util.List;
import java.util.Optional;

/// Reducing a stream with reduce():
/// - The reduce() method combines elements of a stream to produce a single
/// result.
/// - Useful when we want a single summary result, like a sum, product, or maximum
/// value.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));


		// 1. Using reduce() with an accumulator function
		// - This version of reduce() takes a "combiner" function (Integer::sum) to add up
		// values.
		// - Here’s how it works:
		// 1. First step: [10, 20, 30] becomes [30, 30] by summing pairs (10+20=30)
		// 2. Second step: [30, 30] becomes [60] by summing again (30+30=60)
		// 3. The result is 60, wrapped in an Optional to handle cases when there’s no
		// data
		Optional<Integer> sum1 = movies.stream()
			.map(Movie::getLikes) // Maps each movie to its likes (produces a stream of
									// integers)
			.reduce(Integer::sum); // Reduces by summing all the likes

		// Using orElse() to get the value from Optional, or 0 if the stream was empty
		System.out.println(sum1.orElse(0)); // Prints 60 (or 0 if there were no movies)

		// 2. Using reduce() with an initial value
		// - Here, we set an initial value of 0, so the result will never be empty (no
		// Optional).
		// - The stream starts with the initial value and then applies the combiner
		// function.
		Integer sum2 = movies.stream()
			.map(Movie::getLikes) // Maps each movie to its likes
			.reduce(0, Integer::sum); // Reduces by summing all the likes, starting with 0

		System.out.println(sum2); // Prints 60
	}

}
