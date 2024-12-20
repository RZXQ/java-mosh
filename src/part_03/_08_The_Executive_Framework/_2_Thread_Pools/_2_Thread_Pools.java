package part_03._08_The_Executive_Framework._2_Thread_Pools;

/// Problems with manually creating threads:
/// 1. Availability: Creating too many threads can lead to excessive CPU consumption.
/// 2. Cost: When threads finish execution, new threads need to be recreated. For instance,
///    if downloading 10,000 images with only 10 threads available, threads must be repeatedly
///    created and destroyed, which is inefficient.
///
/// Advantages of Thread Pool:
/// 1. Efficient Thread Management: Tasks can simply be submitted to the thread pool.
/// 2. Reusability: Finished threads return to the thread pool instead of being deleted,
///    allowing for efficient reuse.
public class _2_Thread_Pools {

}
