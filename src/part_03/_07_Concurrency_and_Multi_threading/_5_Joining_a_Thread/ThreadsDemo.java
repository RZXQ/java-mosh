package part_03._07_Concurrency_and_Multi_threading._5_Joining_a_Thread;

public class ThreadsDemo {
    public static void show() {
        // Create a new thread that runs the DownloadFileTask
        Thread downloadThread = new Thread(new DownloadFileTask());

        // Start the download thread (begin executing its run method)
        downloadThread.start();

        try {
            // Wait for the downloadThread to complete before moving forward
            // The main thread (current thread) will pause here until downloadThread finishes
            downloadThread.join();

            /*
             * Explanation of join:
             * - The join method causes the main thread to wait until the downloadThread has finished executing.
             * - When downloadThread is done, only then will the main thread resume execution.
             * - The main thread is "blocked" while waiting for downloadThread, which means it does nothing
             *   else until downloadThread completes.
             * - This is especially useful in cases where the main thread needs the result or completion
             *   of another task before proceeding.
             *
             * Potential Downside:
             * - Since the main thread is paused, if this was a UI application, the UI could appear to
             *   "freeze" until downloadThread finishes. It’s important to consider this when using join
             *   in GUI applications.
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This line will only execute after downloadThread completes due to the join above
        System.out.println("File is ready to be scanned");
    }
}