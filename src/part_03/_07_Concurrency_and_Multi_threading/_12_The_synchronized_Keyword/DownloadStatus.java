package part_03._07_Concurrency_and_Multi_threading._12_The_synchronized_Keyword;

public class DownloadStatus {
    // 1. Locks for synchronizing access to the corresponding fields
    private final Object totalBytesLock = new Object(); // Convention to use distinct objects for synchronization
    private final Object totalFilesLock = new Object(); // Ensures that different locks are used for different fields

    // 2. Fields that will be accessed and modified by multiple threads
    private int totalBytes;
    private int totalFiles;

    // 3. Getters to retrieve the current value of the fields
    public int getTotalBytes() {
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    // 4. Method to increment totalBytes
    //    a. Uses a dedicated lock object to avoid blocking other synchronized methods
    //    b. Only synchronizes the critical section, allowing better concurrency
    public void incrementTotalBytes() {
        synchronized (totalBytesLock) { // Critical section starts
            this.totalBytes++;
        }   // Critical section ends
    }

    // 5. Method to increment totalFiles
    //    a. Uses the synchronized keyword on the method level
    //    b. Equivalent to synchronizing on the current object (this)
    //    c. Less efficient than using a dedicated lock as it may cause unnecessary waits
    public synchronized void incrementTotalFiles() {
        this.totalFiles++;
    }
}

// Key Points:
// 1. Using `synchronized` blocks with dedicated lock objects (e.g., totalBytesLock) better isolates critical sections, improving concurrency.
// 2. Synchronizing entire methods (e.g., using `synchronized` keyword on incrementTotalFiles) can cause unnecessary waits by blocking on the entire object.
// 3. Synchronization ensures thread safety but can reduce performance due to missed potential parallelism.
// 4. Preferring synchronized blocks over synchronized methods can lead to more efficient multi-threading.