package part_03._07_Concurrency_and_Multi_threading._16_Adders;

import java.util.concurrent.atomic.LongAdder;

/// **LongAdder & High-Concurrency Updates**
///
///  [ Cell1 ] [ Cell2 ] [ Cell3 ]   <-- Distributed memory cells
///     ↑         ↑         ↑
/// Thread1    Thread2    Thread3
///
/// **How LongAdder Works:**
/// - Unlike AtomicInteger or AtomicLong, which use a single memory cell, LongAdder
///   maintains multiple internal cells to reduce contention in high-concurrency scenarios.
/// - Each thread updates one of these cells independently, avoiding frequent conflicts
///   on a single memory location.
/// - When `intValue()` or `sum()` is called, it aggregates the values in all cells to produce
///   the final result.
///
/// **Advantages:**
/// - Ideal for situations where frequent updates from many threads occur.
/// - Higher throughput compared to AtomicInteger or AtomicLong under contention.
/// - Trades off slightly higher memory usage for significantly improved performance in
///   multi-threaded environments.
public class DownloadStatus {

	// LongAdder: Efficient counter for high-concurrency environments.
	private final LongAdder totalBytes = new LongAdder();

	// Retrieves the current total byte count by aggregating all cells.
	public int getTotalBytes() {
		return totalBytes.intValue(); // Converts long sum to int
	}

	// Increments totalBytes by 1 in a thread-safe manner.
	public void incrementTotalBytes() {
		this.totalBytes.increment();
	}

}
