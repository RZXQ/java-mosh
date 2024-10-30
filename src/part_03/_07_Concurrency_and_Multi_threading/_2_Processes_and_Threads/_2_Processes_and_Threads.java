package part_03._07_Concurrency_and_Multi_threading._2_Processes_and_Threads;

public class _2_Processes_and_Threads {
    public static void main(String[] args) {
        // Thread.activeCount(): returns the number of active threads in the current Java process.
        // Typically includes:
        // 1. The main thread that is running the main program.
        // 2. System threads, such as the garbage collection (GC) thread.
        System.out.println("Active Threads: " + Thread.activeCount());

        // Runtime.getRuntime().availableProcessors(): returns the number of available processor cores.
        // This represents the maximum number of tasks (threads) that can execute concurrently.
        // Note: One thread can only run on a single core at any moment.
        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
    }
}