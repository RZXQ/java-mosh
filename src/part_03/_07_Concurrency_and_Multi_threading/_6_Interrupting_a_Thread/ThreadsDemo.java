package part_03._07_Concurrency_and_Multi_threading._6_Interrupting_a_Thread;

public class ThreadsDemo {
    public static void show() {
        // Create and start a new thread to run the DownloadFileTask
        Thread downloadThread = new Thread(new DownloadFileTask());
        downloadThread.start();

        try {
            // Pause the main thread for 1 second to simulate time passing
            Thread.sleep(1000); // The current thread is the main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Sending an interrupt request to the download thread
        downloadThread.interrupt();

        /*
         * Explanation of interrupt():
         * a. The interrupt() method does not immediately stop the thread; it sends an interrupt request to the thread.
         *    - It's up to the running thread to regularly check for this interrupt request using isInterrupted()
         *      and stop itself if necessary.
         *
         * b. Interrupts in practice:
         *    - In lengthy operations, threads should periodically check for interruptions and respond accordingly.
         *    - If a thread is sleeping or waiting when interrupted, it will throw an InterruptedException.
         *      - This is why we catch InterruptedException in methods like Thread.sleep().
         *
         * Summary:
         * - interrupt() is a request, not a command.
         * - For interruption to work, the running thread must cooperate by checking its interrupted status and exiting
         *   if an interrupt is detected.
         */
    }
}