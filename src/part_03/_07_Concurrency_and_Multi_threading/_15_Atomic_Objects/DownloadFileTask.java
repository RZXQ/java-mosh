package part_03._07_Concurrency_and_Multi_threading._15_Atomic_Objects;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10_000; i++) {

            status.incrementTotalBytes();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}