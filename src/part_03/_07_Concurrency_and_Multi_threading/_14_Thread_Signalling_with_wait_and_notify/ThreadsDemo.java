package part_03._07_Concurrency_and_Multi_threading._14_Thread_Signalling_with_wait_and_notify;

public class ThreadsDemo {
    public static void show() {
        // 1. Create a shared DownloadStatus object to track download progress
        var status = new DownloadStatus();

        // 2. Create a thread to perform the file download
        var thread1 = new Thread(new DownloadFileTask(status));

        // 3. Create a thread to wait for the download to complete and then print total bytes
        var thread2 = new Thread(() -> {
            // 3.1. Loop to check if the download is done
            while (!status.isDone()) {
                // 3.2. Synchronize on the 'status' object before calling 'wait()'
                synchronized (status) {
                    try {
                        // 3.3. Call 'wait()' to make the current thread wait until it is notified
                        //      - 'wait()' must be called from a synchronized context on the same object
                        //      - When 'wait()' is called:
                        //          * The thread releases the lock on 'status' (unlocks it)
                        //          * The thread enters the WAITING state and does not consume CPU resources
                        //      - After being notified:
                        //          * The thread cannot proceed immediately
                        //          * It must re-acquire the lock on 'status' (locks it again)
                        //          * Only after re-acquiring the lock does it continue execution
                        status.wait();
                    } catch (InterruptedException e) {
                        // 3.4. Handle the InterruptedException
                        //      - Re-interrupt the thread to preserve the interrupt status
                        Thread.currentThread().interrupt();
                    }
                }
                // 3.5. After waking up and re-acquiring the lock, the loop checks 'isDone()' again
                //      - It's important to use a loop to handle spurious wake-ups
                //      - Ensures the thread only proceeds when 'isDone()' is true
            }
            // 3.6. Once the download is done, print the total bytes downloaded
            System.out.println(status.getTotalBytes());
        });

        // 4. Start both threads
        thread1.start();
        thread2.start();
    }
}
