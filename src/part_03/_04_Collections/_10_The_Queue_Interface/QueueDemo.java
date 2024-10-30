package part_03._04_Collections._10_The_Queue_Interface;

import java.util.ArrayDeque;
import java.util.Queue;

/// The table below compares four methods of the Queue interface in Java.
///
/// | Method        | Description                                                    | Returns   | Behavior when Queue is empty  |
/// |---------------|----------------------------------------------------------------|-----------|--------------------------------|
/// | `add(E e)`    | Inserts the specified element into this queue                  | boolean   | Throws `IllegalStateException` |
/// | `peek()`      | Retrieves, but does not remove, the head of this queue         | E or null | Returns `null`                |
/// | `element()`   | Retrieves, but does not remove, the head of this queue         | E         | Throws `NoSuchElementException` |
/// | `poll()`      | Retrieves and removes the head of this queue                   | E or null | Returns `null`                |
/// | `remove()`    | Retrieves and removes the head of this queue                   | E         | Throws `NoSuchElementException` |
public class QueueDemo {

	public static void show() {
		Queue<String> queue = new ArrayDeque<>();
		// 1. queue.add()
		queue.add("c");
		queue.add("a");
		queue.add("b");
		// c <- a <- b

		// 2. queue.peek(): get front element, returns null if the queue is empty
		System.out.println(queue.peek());

		// 3. queue.element(): get front element, throws exception if the queue is empty
		System.out.println(queue.element());

		// 4. queue.poll()
		System.out.println(queue.poll());

		// 5. queue.remove()
		System.out.println(queue.remove());
	}

}