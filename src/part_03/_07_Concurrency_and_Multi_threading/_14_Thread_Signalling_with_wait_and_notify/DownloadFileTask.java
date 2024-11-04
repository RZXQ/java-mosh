package part_03._07_Concurrency_and_Multi_threading._14_Thread_Signalling_with_wait_and_notify;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        for (int i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }

            System.out.println("Downloading byte " + i);

            status.incrementTotalBytes();
        }

        status.done();

        // Notify waiting threads that download is complete
        synchronized (status) {
            status.notifyAll();  // notify all threads waiting on this object
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}