package part_03._07_Concurrency_and_Multi_threading._18_Concurrent_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/// **Concurrent Collections vs. Synchronized Collections**
/// - Traditional synchronized collections (e.g., `Collections.synchronizedMap`) lock the entire collection for every operation.
///   This ensures thread safety but can lead to poor performance, as only one thread can access the collection at a time.
///
/// **Concurrent Collections:**
/// - Concurrent collections, such as `ConcurrentHashMap`, improve performance under concurrency.
/// - They use internal partitioning (segmentation) so multiple threads can safely operate on different segments simultaneously.
/// - This reduces contention and improves throughput compared to fully synchronized collections.
///
/// **ConcurrentHashMap:**
/// - Thread-safe without blocking the entire map for each operation.
/// - Multiple threads can read, write, and remove entries concurrently on different segments.
/// - Offers higher performance in multi-threaded scenarios than synchronized maps.
///
/// **In This Code:**
/// - `HashMap` is not thread-safe and can’t be used safely by multiple threads without external synchronization.
/// - `ConcurrentHashMap` provides thread safety without the significant performance penalties of full synchronization.
///
/// **Key Benefit:**
/// - Allows concurrent access and modification, making it suitable for heavily concurrent environments.
public class ThreadsDemo {

	public static void show() {
		Map<Integer, String> map1 = new HashMap<>(); // Not thread-safe

		// ConcurrentHashMap is thread-safe and efficient under concurrency.
		Map<Integer, String> map2 = new ConcurrentHashMap<>();

		// Basic thread-safe operations on ConcurrentHashMap
		map2.put(1, "a");
		map2.get(1);
		map2.remove(1);
	}

}
