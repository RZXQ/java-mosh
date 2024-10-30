package part_03._06_Streams._3_Creating_a_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {

	public static void show() {

		// 1. Creating a stream from a collection (e.g., ArrayList or any type that
		// implements Collection)
		Collection<Integer> x = new ArrayList<>();
		x.stream(); // We can call .stream() on any collection to create a stream from it

		var list = new ArrayList<>();
		list.stream();

		// 2. Creating a stream from an array
		int[] numbers = { 1, 2, 3 };
		// Convert array to stream and print each item
		Arrays.stream(numbers).forEach(n -> System.out.println(n));
		// Same as above but uses method reference for printing
		Arrays.stream(numbers).forEach(System.out::println);

		// 3. Creating a stream from a fixed number of objects
		// Creates a stream containing these specific numbers
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 4. Creating a stream with potentially infinite elements
		// The () -> Math.random() expression will generate a new random number each time
		// we read from the stream
		var stream = Stream.generate(() -> Math.random());
		// Same as above, using method reference for simplicity
		Stream.generate(Math::random);

		// Limits to 3 random numbers and prints each
		stream.limit(3).forEach(n -> System.out.println(n));

		// 5. Using the iterate method to create a stream with a specific pattern
		// Starts from 1 and adds 1 to each subsequent element (1, 2, 3, ..., 10)
		Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
	}

}
