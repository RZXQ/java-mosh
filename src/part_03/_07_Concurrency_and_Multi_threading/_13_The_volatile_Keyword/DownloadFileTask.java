package part_03._07_Concurrency_and_Multi_threading._13_The_volatile_Keyword;

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

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}