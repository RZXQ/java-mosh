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
///
/// | **Aspect**           | **LongAdder Example**                                                                 | **Confinement Example**                                              |
/// |-----------------------|----------------------------------------------------------------------------------------|------------------------------------------------------------------------|
/// | **Core Idea**         | Uses `LongAdder` to distribute updates across multiple internal cells, reducing contention between threads. | Each thread independently manages its own task state, avoiding shared variables and eliminating contention. |
/// | **Data Sharing**      | Multiple threads share a single `LongAdder` instance. The internal cells reduce update contention, but the data is ultimately shared. | Data is confined to each thread, with each thread independently managing its state, requiring no synchronization. |
/// | **Use Cases**         | Suitable for high-concurrency environments requiring frequent updates to a single global counter (e.g., total bytes downloaded). | Suitable for concurrent tasks that need independent results, with final aggregation (e.g., total bytes downloaded across multiple file downloads). |
/// | **Thread Safety Mechanism** | Achieves thread safety through `LongAdder`'s distributed update mechanism, reducing lock contention. | Thread-local data ensures inherent thread safety, requiring no explicit synchronization mechanisms. |
/// | **Performance Characteristics** | Ideal for high-concurrency environments; offers better performance by avoiding frequent lock contention (but slightly increases memory usage). | Simpler implementation that does not rely on complex mechanisms; works well for isolated tasks but may require more effort to aggregate results. |
/// | **Scalability**       | Well-suited for global statistics and growth, easily scaling to more threads.           | Scalability may involve increased overhead for merging results as the number of threads grows. |
/// | **Code Maintenance**  | Centralized counter is intuitive but can involve slightly more complexity (especially when understanding `LongAdder`'s implementation). | Distributed tasks are more intuitive but require explicitly written logic for result aggregation. |
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
