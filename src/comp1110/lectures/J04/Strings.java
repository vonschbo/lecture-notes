package comp1110.lectures.J04;

import java.util.Random;

/**
 * Created by comp1110 on 7/24/15.
 */
public class Strings {
    public static void main(String[] args) {
        String x = "Hello";
        System.out.println(x);
        String y = "world";
        System.out.println(y);
        System.out.println(x + " " + y + "!");

        String z = x + " " + y;
        System.out.println("Concatenation: "+z);
        System.out.println("length: "+z.length());
        System.out.println("charAt: "+z.charAt(4));
        Random r = new Random();
        System.out.println("random: "+z.charAt(r.nextInt(z.length())));
        System.out.println("random: "+z.charAt(r.nextInt(z.length())));
        System.out.println("substring: "+z.substring(1, 4));
        System.out.println("equals(): "+x.equals("hello"));
        System.out.println("equals(): " + x.equals("Hello"));
        System.out.println("equals(): " + x.toLowerCase().equals("hello"));

    }
}
