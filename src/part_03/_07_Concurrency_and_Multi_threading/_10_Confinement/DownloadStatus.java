package part_03._07_Concurrency_and_Multi_threading._10_Confinement;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        this.totalBytes++;
    }
}