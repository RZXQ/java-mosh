package part_03._06_Streams._10_Simple_Reducers;

import java.util.Comparator;
import java.util.List;

/// Reducers:
/// - Reducers are operations that take a stream and reduce it to a single result or value.
/// - Common reducers include operations like counting items, finding matches, and locating specific items (like first, maximum, or minimum).
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		// 1. count()
		// - Counts the total number of items in the stream.
		// - Here, it will count how many movies are in the list.
		System.out.println(movies.stream().count()); // Prints the count of movies

		// 2. anyMatch()
		// - Checks if any item in the stream matches a given condition.
		// - Here, it checks if there is any movie with likes greater than 20.
		var result = movies.stream().anyMatch(m -> m.getLikes() > 20);
		System.out.println(result); // Prints true if at least one movie has likes > 20

		// 3. allMatch()
		// - Checks if all items in the stream match a given condition.
		// - Here, it checks if every movie has likes greater than 20.
		var result2 = movies.stream().allMatch(m -> m.getLikes() > 20);
		System.out.println(result2); // Prints true only if all movies have likes > 20

		// 4. noneMatch()
		// - Checks if no items in the stream match a given condition.
		// - Here, it checks if no movie has likes greater than 20.
		var result3 = movies.stream().noneMatch(m -> m.getLikes() > 20);
		System.out.println(result3); // Prints true if no movies have likes > 20

		// 5. findFirst()
		// - Returns the first item in the stream (wrapped in an Optional).
		// - Optional is used here to avoid null pointer exceptions.
		// - We use get() to retrieve the movie object from Optional.
		System.out.println(movies.stream().findFirst().get().getTitle()); // Prints the
																			// title of
																			// the first
																			// movie

		// 6. findAny()
		// - Returns any item in the stream (wrapped in an Optional).
		// - In most cases, it will return the first item in non-parallel streams.
		System.out.println(movies.stream().findAny().get().getTitle()); // Prints the
																		// title of any
																		// movie found

		// 7. max()
		// - Finds the maximum item in the stream based on a given comparator.
		// - Here, it finds the movie with the highest number of likes.
		var result4 = movies.stream().max(Comparator.comparing(Movie::getLikes));
		System.out.println(result4); // Prints the movie with the most likes

		// 8. min()
		// - Finds the minimum item in the stream based on a given comparator.
		// - Here, it finds the movie with the fewest likes.
		var result5 = movies.stream().min(Comparator.comparing(Movie::getLikes));
		System.out.println(result5); // Prints the movie with the fewest likes
	}

}