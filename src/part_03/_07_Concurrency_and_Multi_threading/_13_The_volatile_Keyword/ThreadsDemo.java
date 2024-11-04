package part_03._07_Concurrency_and_Multi_threading._13_The_volatile_Keyword;

public class ThreadsDemo {
    public static void show() {
        // 1 - Initialize a shared DownloadStatus object to track download progress
        var status = new DownloadStatus();

        // 2 - Create the first thread to simulate downloading a file
        //    - This thread will increment the total bytes downloaded in the status object.
        var thread1 = new Thread(new DownloadFileTask(status));

        // 3 - Create the second thread to monitor download progress
        //    - This thread continuously checks if the download is complete by calling isDone()
        //    - When isDone() returns true, it will print the total bytes downloaded.
        var thread2 = new Thread(() -> {
            while (!status.isDone()) { // Loop until download is complete
                // Busy-waiting until isDone() is true
            }
            System.out.println(status.getTotalBytes()); // Report the total bytes downloaded
        });

        // 4 - Start both threads
        thread1.start();
        thread2.start();
    }
}