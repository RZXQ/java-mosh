package part_03._07_Concurrency_and_Multi_threading._8_Race_Conditions;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo {

    public static void show() {
        // 1. Shared DownloadStatus object
        // All threads will share this single DownloadStatus instance,
        // which leads to a race condition when they access the totalBytes field simultaneously.
        var status = new DownloadStatus();

        // 2. List to store all threads
        List<Thread> threads = new ArrayList<>();

        // 3. Create and start 10 threads
        // Each thread downloads 10,000 bytes, but all share the same DownloadStatus instance.
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        // 4. Wait for all threads to complete
        // The main thread (main) waits for each thread to finish in sequence.
        for (Thread thread : threads) {
            try {
                thread.join(); // Ensures main waits for thread completion before printing totalBytes.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 5. Print the total downloaded bytes
        // Due to race conditions, the final result might not be 100,000 as expected.
        // This discrepancy occurs because threads may read and write the same value of totalBytes simultaneously,
        // resulting in some increments being "lost."
        System.out.println(status.getTotalBytes());
    }
}