package comp1110.lectures.A02;

import comp1110.lectures.A01.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by comp1110 on 8/25/15.
 */
public class ListTest {

    @Test
    public void testAdd() {
        List<String> l = new LinkedList<>();
        assertTrue(l.size() == 0);
        l.add("a");
        assertTrue(l.size() == 1);
        l.add("bb");
        assertTrue(l.size() == 2);
        l.add("ccc");
        assertTrue(l.size() == 3);
        assertTrue(l.toString().equals("a bb ccc"));
    }

    @Test
    public void testRemove() {
        List<String> l = new LinkedList<>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        assertTrue(l.toString().equals("a bb ccc"));
        l.remove(1);
        assertTrue(l.size() == 2);
        assertTrue(l.toString().equals("a ccc"));

        l.remove(0);
        assertTrue(l.size() == 1);
        assertTrue(l.toString().equals("ccc"));

        l.remove(0);
        assertTrue(l.size() == 0);
        assertTrue(l.toString().equals(""));
    }

    @Test
    public void testGet() {
        List<String> l = new LinkedList<>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        assertTrue(l.get(0).equals("a"));
        assertTrue(l.get(1).equals("bb"));
        assertTrue(l.get(2).equals("ccc"));
    }

    @Test
    public void testReverse() {
        List<String> l = new LinkedList<>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        l.reverse();
        assertTrue(l.toString().equals("ccc bb a"));
        assertTrue(l.get(0).equals("ccc"));
        l.reverse();
        assertTrue(l.toString().equals("a bb ccc"));
        l.remove(0);
        l.reverse();
        assertTrue(l.toString().equals("ccc bb"));
    }

}
