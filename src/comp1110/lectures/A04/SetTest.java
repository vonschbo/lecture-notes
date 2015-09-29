package comp1110.lectures.A04;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import comp1110.lectures.A05.BSTSet;

/**
 * Created by comp1110 on 9/29/15.
 */
public class SetTest {
    @Test
    public void testAdd() {
        Set<String> set = new BSTSet<>();
        set.add("Bob");
        System.out.println("We got: "+set);
        assertTrue(set.toString().equals("Bob"));
        assertTrue(set.size() == 1);
        set.add("Mary");
        assertTrue(set.toString().equals("Bob, Mary") || set.toString().equals("Mary, Bob"));
        assertTrue(set.size() == 2);
        set.add("Bob");
        assertTrue(set.toString().equals("Bob, Mary") || set.toString().equals("Mary, Bob"));
        assertTrue(set.size() == 2);
    }

    @Test
    public void testRemove() {
        Set<String> set = new BSTSet<>();
        set.add("Bob");
        set.add("Mary");
        set.add("Fred");
        set.remove("Mary");
        assertTrue(set.toString().equals("Bob, Fred") || set.toString().equals("Fred, Bob"));
        assertTrue(set.size() == 2);
        set.remove("Fred");
        assertTrue(set.toString().equals("Bob"));
        assertTrue(set.size() == 1);
        set.remove("Sue");
        assertTrue(set.toString().equals("Bob"));
        assertTrue(set.size() == 1);
    }

    @Test
    public void testContains() {
        Set<String> set = new BSTSet<>();
        set.add("Bob");
        set.add("Mary");
        set.add("Fred");
        assertTrue(set.contains("Bob") && set.contains("Mary") && set.contains("Fred"));
        assertFalse(set.contains("Sue"));
    }
}
