package part_03._07_Concurrency_and_Multi_threading._4_Pausing_a_Thread;

public class DownloadFileTask implements Runnable { // Runnable interface: represents a task to be run on a thread
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        try {
            // Thread.sleep(): pause the thread for 5 seconds to simulate a download delay
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
