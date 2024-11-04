package part_03._07_Concurrency_and_Multi_threading._13_The_volatile_Keyword;

public class DownloadStatus {
    // 1 - Lock for totalBytes
    // This lock is used specifically for synchronizing access to totalBytes.
    // Using synchronized on totalBytes ensures that multiple threads do not increment it simultaneously,
    // and it also ensures the latest value is visible to other threads when they access it.
    private final Object totalBytesLock = new Object();

    // 2 - Volatile keyword for isDone
    // Declaring isDone as volatile ensures that updates to this variable are immediately visible to all threads.
    // - Without volatile, each thread could keep a cached copy of isDone and might not see changes made by other threads.
    // - Volatile forces all reads/writes to go directly to main memory, bypassing the thread's local cache.
    private volatile boolean isDone; // Indicates if the download is complete

    // 3 - Non-volatile totalBytes
    // totalBytes is not marked as volatile, meaning updates to it may not be immediately visible to other threads.
    // Instead, we use synchronized in incrementTotalBytes() to control visibility and atomicity.
    private int totalBytes;

    // 4 - Getter for totalBytes
    // Returns the current value of totalBytes.
    // - Note: This value may not always be the latest if another thread is updating totalBytes concurrently.
    public int getTotalBytes() {
        return totalBytes;
    }

    // 5 - Increment Method for totalBytes with Synchronization
    // This method safely increments totalBytes by using a synchronized block on totalBytesLock.
    // - Synchronized ensures mutual exclusion, so only one thread can increment at a time.
    // - It also ensures visibility: changes to totalBytes are flushed to main memory after each increment.
    public void incrementTotalBytes() {
        synchronized (totalBytesLock) { // Synchronizing to ensure atomic access and visibility
            this.totalBytes++;
        }
    }

    // 6 - Getter for isDone with Volatile
    // Returns the current value of isDone.
    // - Since isDone is volatile, all threads always see the latest value directly from main memory.
    // - This avoids issues of cached values, making it suitable for flags.
    public boolean isDone() {
        return isDone;
    }

    // 7 - Setter for isDone
    // Sets isDone to true, indicating that the download is complete.
    // - Due to the volatile keyword, this update is immediately visible to other threads.
    public void done() {
        isDone = true;
    }
}