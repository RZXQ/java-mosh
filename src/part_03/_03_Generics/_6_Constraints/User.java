package part_03._03_Generics._6_Constraints;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User>, Cloneable {
    @Override
    public int compareTo(@NotNull User o) {
        return 0;
    }
}
