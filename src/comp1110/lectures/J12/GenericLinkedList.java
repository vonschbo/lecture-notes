package comp1110.lectures.J12;

/**
 * Created by comp1110 on 8/11/15.
 */
public class GenericLinkedList<T> {
    T value;
    GenericLinkedList<T> next;


    GenericLinkedList(T v) {
        this.value = v;
    }

    void add (T v) {
        if (next == null)
            next = new GenericLinkedList<T>(v);
        else
            next.add(v);
    }

    @Override
    public String toString() {
        if (next == null)
            return value + "";
        else
            return value + ", " + next;
    }

    public static void main(String[] args) {
        GenericLinkedList<Integer> ilist = new GenericLinkedList<Integer>(5);
        ilist.add(3);
        ilist.add(7);
        ilist.add(13);
        System.out.println("Here it is! "+ilist);

        GenericLinkedList<Double> dlist = new GenericLinkedList<Double>(5.0);
        dlist.add(3.1);
        dlist.add(7.2);
        dlist.add(13.3);
        System.out.println("Here it is! "+dlist);


        GenericLinkedList<String> slist = new GenericLinkedList<String>("Alice");
        slist.add("Bob");
        slist.add("Cindy");
        slist.add("Dave");
        System.out.println("Here it is! "+slist);
    }
}
