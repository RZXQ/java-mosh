package part_03._06_Streams._3_Creating_a_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreatingStreamsDemo {

	public static void show() {

		// 1. Creating a stream from a collection
		Collection<Integer> collection = new ArrayList<>();
		collection.stream();

		// 2. Creating a stream from an array
		int[] numbers = { 1, 2, 3 };
		Arrays.stream(numbers).forEach(System.out::println);

		// 3. Creating a stream from specified values
		Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);

		// 4. Creating an infinite stream with generate()
		// Lazy evaluation happens when the terminal operation (forEach) is invoked
		Stream.generate(Math::random).limit(3).forEach(System.out::println);

		// 5. Creating an infinite stream with iterate()
		Stream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
	}

}
