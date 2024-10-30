package part_03._06_Streams._6_Slicing_Streams;

import java.util.List;

// Four methods to get specific slices or parts of a stream:
//
// - limit(n): Keeps only the first 'n' elements from the stream.
// - skip(n): Skips the first 'n' elements and includes the rest of the stream.
// - takeWhile(predicate): Continues taking elements as long as the specified condition is true; stops when the condition is false.
// - dropWhile(predicate): Skips elements as long as the condition is true; once it turns false, it includes all following elements.
//
// Difference between takeWhile() and filter():
// - filter(): Checks every element in the entire stream for the given condition.
// - takeWhile(): Stops checking as soon as the condition is false (works only on ordered streams).
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		// 1. Using limit() to get only the first 2 movies
		movies.stream()
			.limit(2) // Keeps only the first two items
			.forEach(m -> System.out.println(m.getTitle())); // Prints the titles of the
																// limited items

		// 2. Using skip() to ignore the first 2 movies
		movies.stream()
			.skip(2) // Skips the first two items and includes the rest
			.forEach(m -> System.out.println(m.getTitle())); // Prints the titles of the
																// remaining items

		// 3. Using skip() and limit() together for pagination
		// For example, if we have 1000 movies and want to show 10 movies per page:
		// - To show page 3, skip the first 20 movies and then limit to 10
		movies.stream()
			.skip(20) // Skips items for the first two pages (20 items in this case)
			.limit(10) // Limits to 10 items for the current page
			.forEach(m -> System.out.println(m.getTitle())); // Prints titles for the
																// selected page items

		// 4. Using takeWhile() to keep items only while a condition is true
		// This will keep showing movies until one is found that doesn't match the
		// condition
		movies.stream()
			.takeWhile(m -> m.getLikes() > 0) // Takes movies while their 'likes' count is
												// greater than 0
			.forEach(m -> System.out.println(m.getTitle())); // Prints titles of movies
																// taken by takeWhile()
		// 5. dropWhile():
		movies.stream().dropWhile(m -> m.getLikes() > 0).forEach(m -> System.out.println(m.getTitle()));

	}

}
