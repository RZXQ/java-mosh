package part_03._04_Collections._10_The_Queue_Interface;

import java.util.ArrayDeque;
import java.util.Queue;

// Introduction:
// -------------
// This tutorial demonstrates how to use the Queue interface in Java.
// Queues are used to store elements in the order they are received,
// following the First-In-First-Out (FIFO) principle.
// Think of a queue like a line at a printer in an organization,
// where jobs are processed in the order they arrive.

public class QueueDemo {

	public static void show() {

		// Creating a Queue:
		// -----------------
		// We use ArrayDeque, which is a resizable array implementation of the Deque
		// interface.
		// Although ArrayDeque is a double-ended queue, here we're using it as a regular
		// Queue.
		Queue<String> queue = new ArrayDeque<>();

		// ADD Operations (Enqueue):
		// -------------------------

		// 1. Adding elements using offer():
		// - Adds the element to the end of the queue.
		// - Returns true if the element was added successfully.
		// - Returns false if the element couldn't be added (e.g., if capacity
		// restrictions apply).
		// - Does NOT throw an exception if the queue is full (which is rare with
		// ArrayDeque).
		queue.offer("c");
		queue.offer("a");
		queue.offer("b");
		queue.offer("d");

		// Queue State:
		// ------------
		// The queue now contains:
		// Front [c, a, b, d] Rear
		// Elements are processed from the front (left) to the rear (right).

		// 2. Adding elements using add():
		// - Also adds the element to the end of the queue.
		// - Throws IllegalStateException if the element cannot be added (e.g., if
		// capacity restrictions apply).
		// - Generally used when you expect the operation to always succeed.
		queue.add("e");

		// READ Operations (Peek):
		// -----------------------

		// 3. Retrieving the element at the front without removing it using peek():
		// - Returns the head of the queue.
		// - Returns null if the queue is empty.
		// - Safe to use when the queue might be empty.
		String frontElement = queue.peek();
		System.out.println("Front element using peek(): " + frontElement);

		// 4. Retrieving the element at the front using element():
		// - Similar to peek(), but throws NoSuchElementException if the queue is empty.
		// - Use when you are certain the queue is not empty.
		String frontElement1 = queue.element();
		System.out.println("Front element using element(): " + frontElement1);

		// REMOVE Operations (Dequeue):
		// ----------------------------

		// 5. Removing the element at the front using poll():
		// - Retrieves and removes the head of the queue.
		// - Returns null if the queue is empty.
		// - Safe to use when the queue might be empty.
		String removedElement = queue.poll();
		System.out.println("Removed element using poll(): " + removedElement);

		// 6. Removing the element at the front using remove():
		// - Retrieves and removes the head of the queue.
		// - Throws NoSuchElementException if the queue is empty.
		// - Use when you are certain the queue is not empty.
		String removedElement1 = queue.remove();
		System.out.println("Removed element using remove(): " + removedElement1);

		// After removals, let's display the remaining elements in the queue.
		System.out.println("Queue after removals: " + queue);

		// Note:
		// -----
		// Be cautious when using methods that throw exceptions if the queue might be
		// empty.
		// Prefer using methods that return special values (null or false) when unsure.

		// USE CASE:
		// ---------
		// Queues are ideal for scenarios where you need to process items in the order
		// they arrive (FIFO - First In, First Out). Examples include:
		// - Task scheduling
		// - Order processing
		// - Breadth-first search algorithms

	}

}
