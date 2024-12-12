package part_03._07_Concurrency_and_Multi_threading._15_Atomic_Objects;

import java.util.concurrent.atomic.AtomicInteger;

///  [ Memory Cell ]  <-- Multiple threads contend for this single cell
///    ↑   ↑   ↑
/// Thread1 Thread2 Thread3
public class DownloadStatus {

	// 1.1 AtomicInteger Field - totalBytes
	// - AtomicInteger is used for thread-safe operations on integers.
	// - It ensures that each thread can safely increment totalBytes even if multiple
	// threads run concurrently.
	//
	// - How CAS (compare-and-swap) works:
	// 1. Suppose `totalBytes` is currently 5.
	// 2. Thread 1 reads `totalBytes` as 5, intending to increment it to 6.
	// 3. Before Thread 1 writes 6, Thread 2 reads `totalBytes` as 5 and also wants to
	// increment it to 6.
	// 4. Thread 1 attempts to "swap" 5 with 6 (CAS). Since the current value is still 5,
	// it succeeds.
	// 5. Now `totalBytes` is 6.
	// 6. Thread 2 tries to "swap" 5 with 6, but finds `totalBytes` is now 6, so it
	// retries.
	// 7. Thread 2 re-reads the new value (6), increments it to 7, and swaps successfully.
	private final AtomicInteger totalBytes = new AtomicInteger();

	// 1.2 Getter Method for Total Bytes
	// - Retrieves the current total byte count safely without locking.
	public int getTotalBytes() {
		return totalBytes.get();
	}

	// 1.3 Increment Method
	// - Increments totalBytes by 1 in a thread-safe manner.
	// - Uses incrementAndGet(), an atomic operation that ensures no interference between
	// threads.
	public void incrementTotalBytes() {
		this.totalBytes.incrementAndGet(); // Atomically increments totalBytes by 1
	}

}