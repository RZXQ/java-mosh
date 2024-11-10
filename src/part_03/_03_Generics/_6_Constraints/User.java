package part_03._03_Generics._6_Constraints;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable, Cloneable {

	@Override
	public int compareTo(@NotNull Object o) {
		return 0;
	}

}