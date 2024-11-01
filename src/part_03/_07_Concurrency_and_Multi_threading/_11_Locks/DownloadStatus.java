package part_03._07_Concurrency_and_Multi_threading._11_Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {

    // 1 - Locking Mechanism
    // - `lock` is a ReentrantLock object that restricts access to `totalBytes`.
    // - Only one thread can modify `totalBytes` at any given time when the lock is acquired.
    private final Lock lock = new ReentrantLock();

    // 2 - Total Bytes Counter
    // - `totalBytes` keeps track of the total bytes downloaded by all threads.
    // - This variable is shared, so updates to it are controlled by the lock.
    private int totalBytes;

    public int getTotalBytes() { // 3 - Getter for `totalBytes`
        return totalBytes;       // - Simply returns the current value of `totalBytes`.
        // - No lock is needed here since it only reads the value.
    }

    public void incrementTotalBytes() { // 4 - Method to safely increment `totalBytes`
        lock.lock();                    // 4.1 - Acquire the lock to ensure exclusive access to `totalBytes`.
        try {
            totalBytes++;               // 4.2 - Safely increment `totalBytes` by 1 while holding the lock.
        } finally {
            lock.unlock();              // 4.3 - Release the lock in `finally` to avoid deadlock, allowing other threads to proceed.
        }
    }
}