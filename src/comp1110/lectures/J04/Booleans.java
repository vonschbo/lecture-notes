package comp1110.lectures.J04;

import java.util.Random;

/**
 * Created by comp1110 on 7/24/15.
 */
public class Booleans {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println("a: "+a);
        boolean b = false;
        System.out.println("b: "+b);
        String s = "TrUE";
        boolean c = Boolean.parseBoolean(s);
        System.out.println("c: "+c);
        Random r = new Random();
        System.out.println("random: "+r.nextBoolean());
        System.out.println("random: "+r.nextBoolean());
        System.out.println("random: "+r.nextBoolean());
        System.out.println("random: "+r.nextBoolean());

        System.out.println("and: "+(a && b));
        System.out.println("or: "+(a || b));
        System.out.println("not: "+(!a));
        System.out.println("xor: "+(a^b));
    }
}
