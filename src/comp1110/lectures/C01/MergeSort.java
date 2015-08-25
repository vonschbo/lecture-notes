package comp1110.lectures.C01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

/**
 * Created by comp1110 on 8/25/15.
 */
public class MergeSort {
    private static List<Integer> mergesort(List<Integer> unsorted) {
        if (unsorted == null || unsorted.size() <= 1 )
            return unsorted;

        int size = unsorted.size();
        List<Integer> left = mergesort(unsorted.subList(0, size / 2));
        List<Integer> right = mergesort(unsorted.subList(size / 2, size));

        int l = 0;
        int r = 0;
        List<Integer> result = new ArrayList<>(size);
        while (l < left.size() || r < right.size()) {
            if (l == left.size() ||
                    (r < right.size()) && right.get(r) < left.get(l)) {
                result.add(right.get(r));
                r++;
            } else {
                result.add(left.get(l));
                l++;
            }
        }
        return result;
    }
/*
    @Test
    public void testSort() {
        Integer[] single = { 7 };
        Integer[] sorted = { 1, 2, 3, 4, 5 };
        Integer[] unsorted = { 5, 3, 2, 1, 4 };
        assertTrue(Arrays.asList(single).equals(mergesort(Arrays.asList(single))));
        assertTrue(Arrays.asList(sorted).equals(mergesort(Arrays.asList(unsorted))));

    }*/

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("enter numbers: ^D to finish");
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }
        System.out.println("Unsorted: "+list);
        System.out.println("Sorted: "+mergesort(list));
    }

}
