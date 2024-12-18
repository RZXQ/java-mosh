package part_03._07_Concurrency_and_Multi_threading._7_Concurrency_Issues;

/// Concurrency issues:
/// 1. Race Condition:
/// - Problem: When two or more threads try to change the same data at the same time,
/// the final value may depend on which thread finishes first.
/// - Example: Two threads adding to the same counter. If they don't coordinate,
/// one thread's update may overwrite the other's, leading to incorrect results.
///
/// 2. Visibility Problem:
/// - Problem: When one thread updates data, other threads might not see the updated value
/// immediately because they are using an outdated copy.
/// - Example: Thread A sets a variable to true, but Thread B keeps seeing it as false
/// because the updated value wasn’t shared properly between threads.
///
/// ---
///
/// **Background Setting (Analogy for the Program’s Memory Model):**
/// Imagine your company has a main ledger (main memory) that records the current inventory
/// (for example, the number of apples). This main ledger is kept in the general manager’s
/// office, which is slower to access but is the authoritative source of information. Each morning,
/// all employees (threads) go to the manager’s office, read the ledger, and copy down the number
/// of apples onto a note at their own desks (cached memory). Throughout the day, they can quickly
/// check the number of apples by looking at their desktop note instead of walking all the way to
/// the manager’s office, thus improving efficiency.
///
/// **Visibility Problem Analogy:**
/// Scenario: On a certain morning, the main ledger shows “10 apples,” and each employee copies down
/// “10” onto their own desk note. Later on, the manager realizes that 5 apples have actually been sold,
/// so he updates the main ledger to “5.” The problem is that each employee’s desk note still shows the
/// outdated number “10.” They don’t know the manager has updated the ledger because they haven’t bothered
/// to go back and check; they still believe there are 10 apples.
/// In a program, if one thread updates a shared variable’s value but another thread continues to use an
/// outdated cached value, you have a visibility problem.
///
/// **Using volatile to Improve Visibility:**
/// If we mark the inventory information as volatile, it’s as if the manager establishes a new rule:
/// “Anyone who wants to read the number of apples must come directly to the manager’s office to check the
/// main ledger and cannot rely on the old note at their desk.”
/// With this rule, when the manager updates the main ledger to “5,” the next time an employee wants to know
/// how many apples are left, they have to go to the main ledger, ensuring they get the latest value instead
/// of relying on stale data.
/// Thus, volatile ensures that every employee (thread) always sees the main ledger’s latest updated information,
/// solving the visibility issue.
///
/// **Race Condition Analogy:**
/// Now consider another problem: Two employees both want to reduce the inventory count of apples. They each see
/// “5” apples (from the main ledger or their note) and decide to update it to “4.” If they do this simultaneously
/// without coordination, both write down “4” as the new count. The correct outcome, after two separate decrements,
/// should be “3,” but since they acted at the same time, they effectively only decremented once.
/// Even with volatile ensuring that they always read the latest value, if they both read “5” at the same time and
/// then both write back “4,” a race condition occurs. Volatile only guarantees visibility of the latest value,
/// not the atomicity or consistency of updates.
///
/// **Solving the Race Condition Analogy:**
/// To prevent this, the manager can set a new rule: “To modify the main ledger’s inventory, you must first obtain
/// the one and only office key.”
/// When an employee holds the key (similar to using synchronized or a lock in code), they can safely read and
/// update the ledger. Other employees must wait until the key is returned before they can make changes. This
/// prevents two people from making simultaneous, conflicting updates and eliminates the race condition.
///
/// **Summary:**
/// - Without volatile: Employees rely on their desk notes (cache), remain unaware of updates to the main ledger,
///   causing visibility issues.
/// - With volatile: Employees must always check the main ledger, ensuring they get the latest value and solving
///   visibility problems. However, simultaneous updates can still cause race conditions.
/// - With locks (e.g., synchronized): Only one person can modify the main ledger at a time, preventing race
///   conditions and ensuring correct updates.
public class _7_Concurrency_Issues {

}