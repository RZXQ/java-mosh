package part_03._06_Streams._9_Peeking_Elements;

import java.util.List;

/// This class demonstrates the use of Java Streams with the peek() method.
///
/// Steps:
/// 1. Create a list of movies.
/// 2. Use a stream to filter and process movies with more than 10 likes.
/// 3. Use peek() for logging filtered and mapped elements.
/// 4. Print the titles of the filtered and mapped movies.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		movies.stream()
			// Step 1: Filter movies with more than 10 likes
			.filter(m -> m.getLikes() > 10)
			// Log filtered movies
			.peek(m -> System.out.println("filtered: " + m.getTitle()))
			// Step 2: Map movies to their titles
			.map(Movie::getTitle)
			// Log mapped titles
			.peek(m -> System.out.println("mapped: " + m))
			// Step 3: Print the final titles
			.forEach(System.out::println);
	}

	public static void main(String[] args) {
		show();
	}

}