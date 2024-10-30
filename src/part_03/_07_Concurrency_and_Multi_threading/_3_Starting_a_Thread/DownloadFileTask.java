package part_03._07_Concurrency_and_Multi_threading._3_Starting_a_Thread;

public class DownloadFileTask implements Runnable { // Runnable interface: represents a task to be run on a thread
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());
    }
}
