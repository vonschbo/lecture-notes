package comp1110.lectures.A02;

/**
 * Created by comp1110 on 8/25/15.
 */
public interface List<T> {
    public void add(T value);
    public void remove(int index);
    public T get(int index);
    public int size();
    public void reverse();
    public String toString();
}
