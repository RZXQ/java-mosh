package part_03._06_Streams._15_Primitive_Type_Streams;

import java.util.stream.IntStream;

/// Demonstrates Primitive Type Streams in Java.
/// Essential Points:
/// 1. Specialized streams for primitives: IntStream, LongStream, DoubleStream.
/// 2. Avoids boxing/unboxing overhead, optimized for performance.
/// 3. `IntStream.rangeClosed(start, end)`: Includes end value.
/// 4. `IntStream.range(start, end)`: Excludes end value.
public class StreamsDemo {

	public static void show() {
		// Generates numbers from 1 to 5 (inclusive)
		IntStream.rangeClosed(1, 5).forEach(System.out::println);

		// Generates numbers from 1 to 4 (end value excluded)
		IntStream.range(1, 5).forEach(System.out::println);
	}

}
