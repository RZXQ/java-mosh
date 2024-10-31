package part_03._07_Concurrency_and_Multi_threading._4_Pausing_a_Thread;

/// Imagine we have a big factory with many workers, each with their own task to complete.
/// Here, the workers represent **threads** in a program, and the factory machines are **CPU cores**.
/// 1. When workers outnumber machines: Using time slices to take turns
/// Let's say the factory has 10 machines (10 CPU cores), but there are 20 workers (20 threads) who need to use them.
/// Since there aren't enough machines for everyone to work at once, the factory uses a "time slice" system.
/// Each worker is given a short amount of time (a **time slice**) to use a machine.
/// When the time slice ends, the worker steps back, and the next worker gets a turn.
/// This approach allows the system to switch tasks so quickly that it creates an illusion of simultaneous work,
/// even if only a limited number of machines are available.
/// 2. Creating the illusion of "simultaneous work"
/// Because the workers (threads) switch very quickly, the machines appear to be shared constantly,
/// making it seem like all workers are working at once. In reality, they are **rapidly taking turns** using the machines.
///
/// 3. True simultaneous work: When there are enough machines
/// If the factory has 20 machines for 20 workers, each worker can use a machine at the same time.
/// This is known as **true parallel execution**, where all workers are genuinely working simultaneously,
/// without needing to take turns.
/// 4. Multicore concurrency: Combining time-slicing and parallelism
/// In a real-world CPU, there are often multiple cores (e.g., 4-core or 8-core CPUs), each core supporting more than one thread,
/// due to technologies like Hyper-Threading. This means a single core can allow two threads to work simultaneously.
///
/// In a system with, say, 10 physical cores that support 20 threads, the thread scheduler can run 10 threads at once across the 10 cores.
/// The remaining 10 threads will take turns, with the scheduler giving them time slices to share the cores.
///
/// **Multicore concurrency** combines **time-slicing** and **parallelism**,
/// where some threads run simultaneously on multiple cores, while others take turns on those cores if there are more threads than cores.
/// Summary:
/// - **Time slice**: Allows each worker (thread) to use a machine (core) briefly before passing it on to the next.
/// - **Scheduler**: Like a factory manager, it decides which worker gets the machine at any given time, balancing fairness and efficiency.
/// - **Multicore concurrency**: With enough cores (machines), some workers can truly work simultaneously while others may take turns,
///   allowing the system to handle more tasks than the number of physical cores.
///
/// This system ensures that even if there are more tasks than machines, the system can still execute them efficiently by blending time-slicing and parallel execution.
public class ThreadsDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName()); // Display the main thread's name

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start(); // Start each thread to make the program faster and more responsive.
        }
    }
}
