package part_03._07_Concurrency_and_Multi_threading._4_Pausing_a_Thread;

/// Imagine we have a big factory with many workers, each with their own task to complete.
/// Here, the workers represent **threads** in a program, and the factory machines are **CPU cores**.

/// 1. When workers outnumber machines: Using time slices to take turns
/// Let's say the factory only has 10 machines (10 CPU cores) but has 20 workers (20 threads) waiting to use them.
/// Clearly, there aren't enough machines for everyone to work at once.
/// To solve this, the factory uses a "time slice" system.
/// Each worker is given a short amount of time to use a machine before giving it up to the next worker.
/// This small time period is called a **time slice**. Workers will try to do as much as they can during their slice.
/// When the time slice ends, they let another worker use the machine.
///
/// 2. Creating the illusion of "simultaneous work"
/// Because the workers switch very quickly, the machines seem to be shared constantly.
/// Although there are only 10 machines, the quick switching makes it seem like all 20 workers are working "at the same time."
/// In reality, they're just **rapidly taking turns** using the machines.
///
/// 3. When there are enough machines: True simultaneous work
/// If the factory has 20 machines for 20 workers, then each worker can use a machine at the same time.
/// In this case, all workers are "truly working simultaneously" without needing to wait or take turns.
/// This is **true parallel execution**.
///
/// 4. Multicore concurrency: Combining time-slicing and parallelism
/// In real-world CPUs, there are often multiple cores (e.g., 4-core or 8-core CPUs),
/// but the number of tasks and threads usually exceeds the number of cores.
///
/// **Multicore concurrency** combines **time-slicing** and **parallelism**.
/// For example, on a 10-core CPU, 10 tasks can run simultaneously, while the other 10 must take turns using time slices.
///
/// Summary:
/// - **Time slice**: Allows each worker to take turns using a machine for a short period.
/// - **Scheduler**: Like a factory manager, it arranges for workers to share machines fairly and complete tasks on time.
/// - **Multicore concurrency**: With enough machines, some workers can truly work simultaneously, while others will take turns.
///
/// This approach ensures that even if there are more tasks than machines, the system can still execute them efficiently.
public class ThreadsDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start(); // multithreading makes our program faster and responding
        }
    }
}