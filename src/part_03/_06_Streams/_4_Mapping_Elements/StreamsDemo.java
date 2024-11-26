package part_03._06_Streams._4_Mapping_Elements;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void show() {
		var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));

		// 1. Print each list
		stream.forEach(System.out::println);

		// 2. Flatten Stream<List<Integer>> to Stream<Integer>
		stream.flatMap(Collection::stream).forEach(System.out::println);
	}

}
