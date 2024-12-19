package part_03._07_Concurrency_and_Multi_threading._15_Atomic_Objects;

import java.util.concurrent.atomic.AtomicInteger;

/// **Understanding AtomicInteger and CAS**
/// AtomicInteger provides methods like incrementAndGet() that use low-level
/// Compare-And-Swap (CAS) operations to ensure thread safety without locking.
///
/// **Why CAS works:**
/// - CAS is an atomic CPU instruction.
/// - A thread reads the current value and calculates a new one (e.g., oldVal + 1).
/// - It tries to set the memory cell to the new value only if the cell still holds the old value.
/// - If another thread changed the value in the meantime, the CAS fails, and the first thread
///   will retry with the latest value.
///
/// This mechanism ensures that concurrent updates do not overwrite each other’s results,
/// thus preventing race conditions. With AtomicInteger, multiple threads can safely increment
/// the same integer without explicit synchronization blocks.
public class DownloadStatus {

	// AtomicInteger field: ensures thread-safe increments without locking.
	private final AtomicInteger totalBytes = new AtomicInteger();

	// Retrieves the current count of totalBytes.
	public int getTotalBytes() {
		return totalBytes.get();
	}

	// Atomically increments totalBytes by 1.
	public void incrementTotalBytes() {
		this.totalBytes.incrementAndGet();
	}

}
