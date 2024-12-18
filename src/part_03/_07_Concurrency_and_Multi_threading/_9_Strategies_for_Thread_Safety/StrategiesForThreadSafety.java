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
///
/// ---
///
/// **Background:**
/// The company has a main ledger (shared data) recording the apple inventory. Multiple employees (threads)
/// need to read and update this ledger simultaneously, which can lead to race conditions where concurrent
/// modifications cause inconsistent data.
///
/// ---
///
/// **1. Confinement**
/// **Program Concept:** Partition or subdivide the data so that each thread handles its own portion.
/// Throughout the process, no two threads modify the same data. When all tasks are complete, a single thread
/// merges the results in a final step.
///
/// **Real-World Analogy:**
/// In the morning, the manager divides a batch of apples among various employees. Each employee gets their
/// own smaller inventory and a personal ledger. Throughout the day, they record and update the count of their
/// own apples only. No one else touches their ledger.
///
/// - During the workday: Employee A updates their small ledger, Employee B updates theirs, etc.
///   There is no contention or need for locks because no one shares the same ledger data.
/// - At the end of the day (similar to the final merge phase in a program), all employees hand their personal
///   ledgers to the manager. The manager, after work (non-concurrent time), consolidates the numbers into the
///   main ledger. This avoids any concurrency issues during the merging.
///
/// By doing so, concurrency-related data conflicts are completely avoided during the work process.
///
/// ---
///
/// **2. Immutability**
/// **Program Concept:** Use immutable objects (unchangeable after creation). Multiple threads may read these
/// objects concurrently without any risk of update conflicts.
///
/// **Real-World Analogy:**
/// Each morning, the manager posts a “final inventory report from yesterday” on the bulletin board. Once
/// printed, it never changes. Employees can all read this same report without conflict, since it’s not
/// modified after creation.
///
/// If a new report is needed (e.g., today’s stats), the manager prints a new one rather than editing the old one.
/// Old reports remain available, representing past data states. Thus, no read operation is ever disrupted by
/// modifications.
///
/// ---
///
/// **3. Synchronization**
/// **Program Concept:** Use locks or synchronized blocks when multiple threads access shared data, ensuring
/// only one thread modifies the data at a time to prevent race conditions.
///
/// **Real-World Analogy:**
/// The company still has a single main ledger in the manager’s office. Now, the manager sets a rule:
///
/// - Any employee wanting to write in the main ledger must first obtain the single office key.
/// - With the key, they exclusively view and update the ledger, then return the key.
/// - Other employees wait until the key is returned.
///
/// This ensures only one employee writes at a time, avoiding concurrent modifications and keeping the ledger’s
/// data consistent. Reading and writing proceed in an orderly, conflict-free manner.
///
/// ---
///
/// **4. Atomic Objects**
/// **Program Concept:** Use atomic classes (like `AtomicInteger`) so certain operations (like increments) are
/// indivisible, preventing interruptions that could lead to inconsistencies.
///
/// **Real-World Analogy:**
/// The manager places a special automatic counter machine beside the ledger. Instead of writing numbers
/// directly, employees press a “+1” or “-1” button on the machine:
///
/// - Pressing the button ensures the increment/decrement happens as a single, atomic action.
/// - If multiple employees press simultaneously, the machine handles them one by one without mixing results.
///
/// Thus, there’s no scenario where an employee reads an outdated value and writes it back incorrectly. Atomic
/// operations ensure consistent and up-to-date results.
///
/// ---
///
/// **5. Partitioning**
/// **Program Concept:** Divide shared data or tasks among different threads, minimizing the chance that
/// multiple threads access the same data. Then, consolidate the results in a controlled manner later.
///
/// **Real-World Analogy:**
/// The company uses multiple warehouses (data partitions), each storing different kinds or batches of apples.
/// Each warehouse is managed by a different employee:
///
/// - Employee A manages warehouse one, Employee B manages warehouse two, etc.
/// - Because the data is isolated per warehouse, no locks are needed and no conflicts arise during updates.
/// - At the end of the day, the manager collects the ledgers from each warehouse and merges them into a final
///   report in a non-concurrent or carefully synchronized step.
///
/// This approach almost entirely removes conflicts, since each thread works on its own isolated data segment.
///
/// ---
///
/// **Summary:**
/// - Confinement: Split the problem so each thread works on separate data, and then merge results afterward.
/// - Immutability: Keep data read-only and never changing to avoid any concurrency conflicts.
/// - Synchronization: Use a “key” (lock) so only one thread modifies data at a time, ensuring consistency.
/// - Atomic Objects: Rely on atomic operations that complete in one step, preventing partial and inconsistent states.
/// - Partitioning: Divide data or tasks to reduce shared access, minimizing the potential for conflicts.
public class StrategiesForThreadSafety {

}