package comp1110.lectures.J12;

/**
 * Created by comp1110 on 8/11/15.
 */
public class IntLinkedList {
    int value;
    IntLinkedList next = null;  // unnecessary assignment


    IntLinkedList(int v) {
        this.value = v;
        this.next = null;  //  unnecessary assignment
    }

    void add (int v) {
        if (next == null)
            next = new IntLinkedList(v);
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
        IntLinkedList list = new IntLinkedList(5);
        list.add(3);
        list.add(7);
        list.add(13);
        System.out.println("Here it is! "+list);
    }
}
