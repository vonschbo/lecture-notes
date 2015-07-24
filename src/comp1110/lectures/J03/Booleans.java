package comp1110.lectures.J03;

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
    }
}
