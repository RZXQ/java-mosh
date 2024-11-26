package part_03._06_Streams._12_Collectors;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/// Collectors:
/// Provides methods to transform streams into collections/summary results.
/// 1. Collectors.toList(): Collect as a List.
/// 2. Collectors.toSet(): Collect as a Set.
/// 3. Collectors.toMap(title -> likes): Collect as a Map (title -> likes).
/// 4. Collectors.toMap(title -> object): Collect as a Map (title -> object).
/// 5. Collectors.summingInt(movie -> movie.getLikes()): Sum likes.
/// 6. Collectors.summarizingInt(movie -> movie.getLikes()): Summarize likes.
/// 7. Collectors.joining(separator): Join titles.
public class StreamsDemo {

	public static void show() {
		var movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));

		// 1. Collectors.toList(): Collect as a List
		System.out.println(movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toList()));

		// 2. Collectors.toSet(): Collect as a Set
		System.out.println(movies.stream().filter(m -> m.getLikes() > 10).collect(Collectors.toSet()));

		// 3. Collectors.toMap(title -> likes): Collect as a Map (title -> likes)
		System.out.println(movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.toMap(Movie::getTitle, Movie::getLikes)));

		// 4. Collectors.toMap(title -> object): Collect as a Map (title -> object)
		System.out.println(movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.toMap(Movie::getTitle, Function.identity())));

		// 5. Collectors.summingInt(movie -> movie.getLikes()): Sum likes
		System.out.println(movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.summingInt(movie -> movie.getLikes())));

		// 6. Collectors.summarizingInt(movie -> movie.getLikes()): Summarize likes
		System.out.println(movies.stream()
			.filter(m -> m.getLikes() > 10)
			.collect(Collectors.summarizingInt(movie -> movie.getLikes())));

		// 7. Collectors.joining(", "): Join titles
		System.out.println(
				movies.stream().filter(m -> m.getLikes() > 10).map(Movie::getTitle).collect(Collectors.joining(", ")));

	}

	public static void main(String[] args) {
		show();
	}

}