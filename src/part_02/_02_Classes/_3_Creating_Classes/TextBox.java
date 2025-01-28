package part_02._02_Classes._3_Creating_Classes;

/*===============================================================================
 *                                TextBox Class
 *===============================================================================
 * Note:
 * 1. Field: `text` stores the current state of the TextBox.
 * 2. Methods:
 *    - `setText(String text)`: Sets the value of `text` for the current object.
 *    - `clear()`: Clears the text by setting it to an empty string.
 * 3. `this`: Refers to the current object to avoid ambiguity when accessing fields.
 */

public class TextBox {

	public String text;

	public void setText(String text) {
		this.text = text;
	}

	public void clear() {
		this.text = "";
	}

}
