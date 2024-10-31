package part_03._07_Concurrency_and_Multi_threading._6_Interrupting_a_Thread;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());

        // Continuously check if the thread is interrupted
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            // If an interrupt request is received, stop the task
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Download interrupted at byte " + i);
                return; // Exit the run method to stop the thread
            }

            System.out.println("Downloading byte " + i);
        }

        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}