package part_03._07_Concurrency_and_Multi_threading._8_Race_Conditions;

public class DownloadFileTask implements Runnable {

    private final DownloadStatus status;

    // 1. Constructor
    // Initializes the task with a shared DownloadStatus object, which stores the total bytes downloaded.
    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        // 2. Loop simulates downloading bytes
        // Each iteration represents downloading a byte.
        // The loop runs 10,000 times to simulate downloading 10,000 bytes.
        for (int i = 0; i < 10_000; i++) {
            // 2.1 Check for interruption
            // If this thread is interrupted, stop downloading.
            if (Thread.currentThread().isInterrupted()) {
                return;
            }

            System.out.println("Downloading byte " + i);

            // 2.2 Increment total bytes in DownloadStatus
            // The status is shared across multiple threads,
            // leading to a race condition when they try to increment totalBytes simultaneously.
            status.incrementTotalBytes();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}