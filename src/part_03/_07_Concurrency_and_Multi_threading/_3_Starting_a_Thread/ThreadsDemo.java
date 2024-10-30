package part_03._07_Concurrency_and_Multi_threading._3_Starting_a_Thread;

public class ThreadsDemo {
    public static void show() {
        // Print the name of the current thread (main thread in this case).
        // This confirms that `show()` is initially executed by the main thread.
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        // Loop to create and start 10 separate threads.
        for (int i = 0; i < 10; i++) {
            // Each iteration creates a new thread to perform the task in parallel.
            // This task is encapsulated in the `DownloadFileTask` class.
            Thread thread = new Thread(new DownloadFileTask());
            thread.start(); // Start the thread, initiating its `run()` method asynchronously.

            // Key points:
            // 1. Each thread is created and started independently to perform the download task concurrently.
            // 2. Once a thread completes its assigned task, it automatically terminates.
            //    No explicit code is needed to terminate the thread; Java handles the lifecycle.
            // 3. While output may look sequential due to the main thread's rapid execution of the loop,
            //    these threads are actually executing concurrently, possibly using separate CPU cores.
            //    The order of outputs depends on the system's task scheduling.
        }

        // Note: The main thread may finish executing this line before all 10 threads complete,
        //       because it does not wait for them by default.
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
    }
}