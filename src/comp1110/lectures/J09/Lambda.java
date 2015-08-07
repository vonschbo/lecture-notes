package comp1110.lectures.J09;

import java.util.function.IntPredicate;

/**
 * Created by comp1110 on 8/7/15.
 */
public class Lambda {



    static void printBig(int value, IntPredicate bigTest) {
        if (bigTest.test(value)) {
            System.out.println("Yep, "+value+" is big!");
        } else {
            System.out.println("No, not really...");
        }
    }

    public static void main(String[] args) {
        printBig(200, x -> x > 1000);
        IntPredicate bt = x -> x > 100;
        printBig(10, bt);
        printBig(101, bt);
    }
}
