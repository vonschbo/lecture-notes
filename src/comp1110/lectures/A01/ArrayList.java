package comp1110.lectures.A01;

/**
 * Created by comp1110 on 8/25/15.
 */
public class ArrayList<T> implements List<T> {

    private static final int INITIAL_SIZE = 2;  // start with a small value for debugging
    private static final double GROWTH_FACTOR = 1.5;


    T[] values = (T[]) new Object[INITIAL_SIZE];
    int elements = 0;


    @Override
    public void add(T value) {
        if (elements == values.length) {
            T[] tmp = (T[]) new Object[(int) (elements * GROWTH_FACTOR)];
            for (int i = 0; i < elements; i++) {
                tmp[i] = values[i];
            }
            values = tmp;
        }

        values[elements++] = value;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public void reverse() {

    }

    @Override
    public String toString() {
        String rtn = "";
        for (int i = 0; i < elements; i++) {
            rtn += ((i != 0) ? " " : "") + values[i];
        }
        return  rtn;
    }
}
