package part_03._05_Lambda_Expressions_and_Functional_Interfaces._12_Composing_Functions;

import java.util.function.Function;

/// Think of functions like "machines" that take something, change it, and give it
/// back.
///
/// **"andThen"** means: *First, do this, then do that.*
/// - Example: Replace a colon with an equals sign (first change), then add braces
/// (second change). Transforming `"key:value"` to `"key=value"`, then to
/// `"{key=value}"`.
///
/// **"compose"** means: *Do the second thing first, then the first thing.*
/// - Example: Add braces first, then replace the colon. So, `"key:value"` becomes
/// `"{key:value}"` after adding braces, and then `"{key=value}"` after replacing
/// the colon.
///
/// It's all about the order of operations:
/// - **andThen**: Functions are executed in the order they are written.
/// - **compose**: Functions are executed in reverse order.
public class LambdasDemo {

	public static void show() {

		// Task description:
		// Transform the string "key:value" in two steps:
		// 1. Replace the colon ":" with an equals sign "=" to get "key=value".
		// 2. Add braces "{}" around the string to get "{key=value}".

		// Define the function to replace ":" with "="
		Function<String, String> replaceColon = str -> str.replace(":", "=");

		// Define the function to add braces around the string
		Function<String, String> addBraces = str -> "{" + str + "}";

		// Option 1: Using andThen to chain functions (do replaceColon first, then
		// addBraces)
		String result1 = replaceColon.andThen(addBraces).apply("key:value");
		System.out.println("Using andThen: " + result1);
		// Output: Using andThen: {key=value}

		// Option 2: Using compose to chain functions (replaceColon first, then
		// addBraces)
		String result2 = addBraces.compose(replaceColon).apply("key:value");
		System.out.println("Using compose: " + result2);
		// Output: Using compose: {key=value}

		// Option 3: Manually chaining functions by applying one after the other
		// (Option 3, where functions are manually chained by applying one after the
		// other, is effectively the inner implementation of Option 2, which uses the
		// `compose` method to chain functions.)
		String result3 = addBraces.apply(replaceColon.apply("key:value"));
		System.out.println("Manual chaining: " + result3);
		// Output: Manual chaining: {key=value}
	}

}
