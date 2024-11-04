package part_03._07_Concurrency_and_Multi_threading._13_The_volatile_Keyword;

public class ThreadsDemo {
    public static void show() {
        // create 2 threads: one simulating downloading a file, the other checks to see if the download is finish, if the download if finish, report something to the user
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}