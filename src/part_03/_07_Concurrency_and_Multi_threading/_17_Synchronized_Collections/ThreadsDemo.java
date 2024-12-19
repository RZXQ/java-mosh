package part_03._07_Concurrency_and_Multi_threading._17_Synchronized_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/// **Synchronized Collections and Race Condition Prevention**
/// - Wrapping a collection with `Collections.synchronizedCollection` ensures thread safety by synchronizing
///   all access methods (e.g., add, remove) on the underlying collection.
/// - Without synchronization, multiple threads modifying the collection concurrently could cause race conditions,
///   leading to data corruption or inconsistent states.
/// - Synchronization ensures that only one thread at a time can access or modify the collection, effectively
///   preventing race conditions.
///
/// **How Synchronization Works:**
/// 1. The `Collections.synchronizedCollection` method wraps the underlying collection and synchronizes all its methods.
/// 2. Each synchronized method locks on the collection object itself (`this`) before proceeding. For example:
///    ```java
///    public boolean add(E e) {
///        synchronized (this) {
///            return c.add(e);
///        }
///    }
///    ```
/// 3. This ensures that all operations on the collection, such as `add` or `remove`, are executed sequentially by
///    acquiring a lock on the collection object.
///
/// **Key Points:**
/// - The synchronization prevents multiple threads from modifying the collection at the same time.
/// - This is especially important for methods like `addAll` that modify the collection state.
/// - The synchronized wrapper ensures data consistency and avoids issues like concurrent modification exceptions.
public class ThreadsDemo {

	public static void show() {
		Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

		var thread1 = new Thread(() -> {
			collection.addAll(Arrays.asList(1, 2, 3));
		});

		var thread2 = new Thread(() -> {
			collection.addAll(Arrays.asList(4, 5, 6));
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		}
		catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		System.out.println(collection);
	}

}
