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
