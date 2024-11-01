package part_03._07_Concurrency_and_Multi_threading._12_The_synchronized_Keyword;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo {

    public static void show() {
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalBytes());
    }
}