package part_02._02_Classes._5_Memory_Allocation;

import part_02._02_Classes._3_Creating_Classes.TextBox;

/*===============================================================================
 *                           Memory Allocation in Java
 *===============================================================================
 * Note:
 * 1. When `new` is used, memory is allocated in the heap for each object.
 * 2. `textBox1` and `textBox2` are references stored in the stack, pointing to objects in the heap.
 * 3. Each object in the heap has its own copy of the fields (e.g., `text`).
 * 4. Modifying `text` in one object does not affect the other.
 */

public class _5_Memory_Allocation {

	public static void main(String[] args) {
		TextBox textBox1 = new TextBox(); // Allocates memory for textBox1 in the heap
		TextBox textBox2 = new TextBox(); // Allocates memory for textBox2 in the heap

		textBox2.setText("Hello World"); // Modifies the text field of textBox2
		System.out.println(textBox1.text); // Outputs null, as textBox1.text is unmodified
	}

}
