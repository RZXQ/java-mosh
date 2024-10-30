package part_03._07_Concurrency_and_Multi_threading._2_Processes_and_Threads;

public class _2_Processes_and_Threads {
    public static void main(String[] args) {
        // Thread.activeCount(): returns the number of active threads in the current process.
        // Typically includes:
        // 1. The main thread that runs the program.
        // 2. The garbage collection (GC) thread.
        System.out.println("Active Threads: " + Thread.activeCount());

        // Runtime.getRuntime().availableProcessors(): returns the total number of available processors.
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
    }
}