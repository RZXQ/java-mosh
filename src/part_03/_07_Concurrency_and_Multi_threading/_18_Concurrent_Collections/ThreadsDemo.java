package part_03._07_Concurrency_and_Multi_threading._18_Concurrent_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadsDemo {
    public static void show() {
        // 1. Synchronized Collection Drawbacks
        // - Synchronized collections (e.g., Collections.synchronizedMap) use locks to control access.
        // - While locks ensure thread safety, they can reduce performance due to blocking,
        //   as only one thread can access the entire collection at any time.

        // 2. Solution: Concurrent Collections
        // - Concurrent collections, such as ConcurrentHashMap, address the performance issue.
        // - They use "partitioning" (or segmentation), dividing the collection into segments.
        // - Multiple threads can safely operate on different segments simultaneously,
        //   which improves performance compared to traditional synchronization.
        // - Only one thread can modify a given segment at a time, ensuring thread safety without full locking.
        // - These classes are found in the `java.util.concurrent` package.

        Map<Integer, String> map1 = new HashMap<>(); // Regular HashMap (NOT thread-safe)

        // 3. Using ConcurrentHashMap
        // - ConcurrentHashMap is thread-safe and avoids the performance issues of full synchronization.
        // - Threads can perform operations concurrently on different parts of the map.
        Map<Integer, String> map2 = new ConcurrentHashMap<>();

        // 4. Basic Operations on ConcurrentHashMap
        // - These operations are thread-safe and can be performed concurrently by multiple threads.
        map2.put(1, "a");    // Add an entry to the map
        map2.get(1);         // Retrieve an entry from the map
        map2.remove(1);      // Remove an entry from the map
    }
}