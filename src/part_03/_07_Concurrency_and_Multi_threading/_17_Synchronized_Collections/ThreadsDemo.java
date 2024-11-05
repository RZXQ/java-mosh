package part_03._07_Concurrency_and_Multi_threading._17_Synchronized_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ThreadsDemo {
    public static void show() {
        // 1. Creating a Thread-Safe Collection
        // Wrapping ArrayList with Collections.synchronizedCollection makes it thread-safe.
        // This is achieved by synchronizing all access methods (like add, remove, etc.)
        // on the collection object itself, preventing concurrent modifications.
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());

        // 2. Defining Threads
        // - Thread1 and Thread2 each add a separate list of integers to the collection.
        // - Due to synchronization, these operations are mutually exclusive.
        //   Only one thread can modify the collection at any given time.
        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });

        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        // 3. Starting Threads
        // - thread1 and thread2 are started simultaneously.
        // - Each thread will attempt to add elements to the collection.
        thread1.start();
        thread2.start();

        // 4. Waiting for Threads to Complete
        // - join() ensures that the main thread waits for thread1 and thread2 to finish.
        // - This guarantees that all modifications are completed before printing the collection.
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 5. Printing Final Collection Contents
        // - The final state of the collection is printed after both threads complete.
        // - Since the collection is synchronized, it will display all added elements safely.
        System.out.println(collection);
    }
}