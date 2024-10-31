package part_03._07_Concurrency_and_Multi_threading._9_Strategies_for_Thread_Safety;

/// Why these strategies achieve thread safety:
///
/// 1. Confinement
/// - By keeping data restricted to a single thread (like using local variables within a method),
///   you eliminate the need for other threads to access it.
/// - Since no other thread can see or modify the confined data, there's no risk of conflicts.
///
/// 2. Immutability
/// - Immutable objects cannot be changed after they’re created, so any thread can safely read them without worry.
/// - Since no thread can modify the state of an immutable object, there’s no risk of data inconsistency.
///
/// 3. Synchronization
/// - Synchronization allows only one thread to access a critical section of code at a time, preventing race conditions.
/// - It effectively “locks” the code block, so multiple threads don’t try to read and write to shared data simultaneously.
///
/// 4. Atomic Objects
/// - Atomic objects, like `AtomicInteger`, handle thread safety internally, performing operations in an "all-or-nothing" manner.
/// - They provide atomic methods (like increment) that complete in one step, so other threads can’t interrupt the operation halfway.
///
/// 5. Partitioning
/// - By dividing data or work into separate parts for different threads, you reduce the need for threads to access shared data.
/// - Each thread works on its own portion independently, so there’s no interference or need for synchronization between them.
public class StrategiesForThreadSafety {
    // Implementation code here...
}