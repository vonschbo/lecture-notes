package comp1110.lectures.J04;

import java.util.Random;

/**
 * Created by comp1110 on 7/24/15.
 */
public class Integers {
    public static void main(String[] args) {
        int x = 123_456;
        System.out.println("x: "+x);
        int y = 0b110000;
        System.out.println("y: "+y);
        String s = "234";
        int z = Integer.parseInt(s);
        System.out.println("z: "+z);

        Random r = new Random();
        int w = r.nextInt();
        System.out.println("random: "+w);

        System.out.println("not add, but string concatenation: "+3+5);
        System.out.println("add: "+(3+5));
        System.out.println("sub: "+(3-5));
        System.out.println("mul: "+(3*5));
        System.out.println("div: "+(3/5));
        System.out.println("remainder: "+(8%5));
        System.out.println("remainder: "+(-8%5));
        System.out.println("bit shift: "+(2121321>>5));
        System.out.println("bit shift: "+(2121321>>>5));
        System.out.println("bit shift: "+(-2121321>>5));
        System.out.println("bit shift: "+(-2121321>>>5));
        System.out.println("bit shift: "+(2121321<<5));
        System.out.println("bit shift: "+(-2121322 & 5));
        System.out.println("bit shift: "+(2121321 | 5));

        System.out.println("cast to double: " + (double) 42);
        System.out.println("max: "+Integer.MAX_VALUE);
        System.out.println("max: "+Integer.MIN_VALUE);

        int sum = x + 5;
        System.out.println("add: "+sum);
        sum++;
        System.out.println("inc: "+sum);
        sum--;
        System.out.println("dec: "+sum);

    }
}
