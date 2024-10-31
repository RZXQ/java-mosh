package part_03._07_Concurrency_and_Multi_threading._8_Race_Conditions;

public class DownloadStatus {
    private int totalBytes;

    // 1. Getter for total bytes
    public int getTotalBytes() {
        return totalBytes;
    }

    // 2. Increment method
    // This method increments totalBytes by one each time it's called.
    // The operation is non-atomic, meaning it consists of multiple steps:
    //   2.1. The current value of totalBytes is read from memory.
    //   2.2. The CPU increments this value.
    //   2.3. The incremented value is stored back in memory.
    // When multiple threads call this method concurrently, they may read the same initial value
    // before any of them writes the updated value back to memory. This results in missed increments.
    public void incrementTotalBytes() {
        this.totalBytes++;
    }
}