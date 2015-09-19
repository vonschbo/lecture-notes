package comp1110.lectures.A02;

/**
 * Created by comp1110 on 9/1/15.
 */
public class LinkedList<T> implements List<T> {
    int elements;
    Node first, last;

    class Node {
        T value;
        Node next;
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return value + ((next == null) ? "" : " " + next.toString());
        }
    }

    @Override
    public void add(T value) {
        if (first == null) {
            first = last = new Node(value, null);
        } else {
            /* common case */
            last.next = new Node(value, null);
            last = last.next;
        }

        elements++;

    }

    @Override
    public void remove(int index) {
        if (index >= elements || index < 0)
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            first = first.next;
            if (first == null)
                last = null;
        } else {
            Node prev = getNode(first, index - 1);
            prev.next = prev.next.next;
            if (prev.next == null) // we removed the last one
                last = prev;
        }

        elements--;
    }

    private Node getNode(Node start, int offset) {
        return (offset == 0) ? start : getNode(start.next, offset - 1);
    }

    @Override
    public T get(int index) {
        if (index >= elements || index < 0)
            throw new IndexOutOfBoundsException();

        return getNode(first, index).value;
    }

    @Override
    public int size() {
        return elements;
    }


    private Node recursiveReversal(Node me) {
        if (me.next == null)
            return me;
        else {
            Node newLast = me.next;
            Node start = recursiveReversal(newLast);
            newLast.next = me;
            return start;
        }
    }

    @Override
    public void reverse() {
        if (first == null) return;

        last = first;
        first = recursiveReversal(first);
        last.next = null;
    }

    @Override
    public String toString() {
        return (first == null) ? "" : first.toString();
    }
}
