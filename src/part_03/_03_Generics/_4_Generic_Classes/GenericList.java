package part_03._03_Generics._4_Generic_Classes;

public class GenericList<T> {
    private final T[] items = (T[]) new Object[10];

    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
