package part_03._07_Concurrency_and_Multi_threading._16_Adders;

import java.util.concurrent.atomic.LongAdder;

///  [ Cell1 ] [ Cell2 ] [ Cell3 ]   <-- Distributed memory cells
///     ↑         ↑         ↑
/// Thread1    Thread2    Thread3
public class DownloadStatus {

	// 1. LongAdder for High-Concurrency Updates
	// - LongAdder is efficient for cases with frequent updates by multiple threads.
	// - Compared to AtomicInteger or AtomicLong, which update a single memory location
	// (causing contention), LongAdder distributes updates across multiple cells.
	// - Each cell holds part of the total, allowing threads to update separate cells
	// concurrently.
	// - This reduces contention and improves performance in high-concurrency scenarios.
	private final LongAdder totalBytes = new LongAdder();

	// 2. getTotalBytes() Method - Returns the current total byte count.
	// - LongAdder.intValue() aggregates (sums) the values in all cells for the final
	// result.
	public int getTotalBytes() {
		return totalBytes.intValue(); // Converts long sum to int
	}

	// 3. incrementTotalBytes() Method - Increments totalBytes by 1.
	// - Adds 1 to one of LongAdder's internal cells, ensuring fast and thread-safe
	// increments.
	public void incrementTotalBytes() {
		this.totalBytes.increment();
	}

}