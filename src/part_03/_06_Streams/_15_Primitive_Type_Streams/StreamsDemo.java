package part_03._06_Streams._15_Primitive_Type_Streams;

import java.util.stream.IntStream;

/// Primitive Type Streams:
/// - In Java, there are specialized streams for handling primitive types (IntStream, LongStream, DoubleStream).
/// - These are optimized for performance when working with primitives and avoid the overhead of boxing/unboxing.
/// - Two common methods in IntStream:
///   1. IntStream.rangeClosed(start, end): Generates a stream of integers from 'start' to 'end' (inclusive).
///   2. IntStream.range(start, end): Generates a stream of integers from 'start' to 'end' (exclusive of 'end').
public class StreamsDemo {

	public static void show() {
		// 1. IntStream.rangeClosed()
		// - Generates numbers from 1 to 5, inclusive.
		// - Prints: 1, 2, 3, 4, 5
		IntStream.rangeClosed(1, 5).forEach(System.out::println);

		// 2. IntStream.range()
		// - Generates numbers from 1 to 5, exclusive of 5.
		// - Prints: 1, 2, 3, 4
		IntStream.range(1, 5).forEach(System.out::println);
	}

}
