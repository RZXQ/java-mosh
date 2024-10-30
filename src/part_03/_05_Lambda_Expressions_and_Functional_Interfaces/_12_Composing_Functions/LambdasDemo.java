/// Think of functions like "machines" that take something, change it, and give it back.
///
/// "andThen" means: "First, do this, then do that."
/// Example: If you replace a colon with an equals sign (first change), then add braces (second change),
/// it's like transforming "key:value" to "key=value", then to "{key=value}".
///
/// "compose" means: "Do the second thing first, then the first thing."
/// Example: If you add braces first, then replace the colon, you're doing the steps in reverse.
/// So, "key:value" becomes "key=value" (after replacing), and then "{key=value}" after adding the braces.
///
/// So, it's just about what order you're doing things in: "andThen" goes step by step in the order
/// the functions are written, while "compose" goes backward, doing the last one first.
package part_03._05_Lambda_Expressions_and_Functional_Interfaces._12_Composing_Functions;

import java.util.function.Function;

public class LambdasDemo {

	public static void show() {
		// "key:value"
		// first transformation: "key=value"
		// second transformation: "{key=value}"

		Function<String, String> replaceColon = str -> str.replace(":", "=");
		// System.out.println(replaceColon.apply("key:value"));

		Function<String, String> addBraces = str -> "{" + str + "}";
		// System.out.println(addBraces.apply("key:value"));

		// 1. first way to compose functions(declarative programming):
		System.out.println(replaceColon.andThen(addBraces).apply("key:value"));

		// 2. second way to compose functions: in the reverse order
		System.out.println(addBraces.compose(replaceColon).apply("key:value"));
	}

}
