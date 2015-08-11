package comp1110.lectures.J10;

/**
 * Created by comp1110 on 8/11/15.
 */
public class Boxing {
    public static void main(String[] args) {
        Integer a = new Integer(6);
        Integer b = 6;   // autoboxing
        int c = a;   // auto un-boxing
        int d = new Integer(6);  // gratuitous auto unboxing


        if (a == b)
            System.out.println("a ("+a+") == b ("+b+")");
        else
            System.out.println("a ("+a+") != b ("+b+")");

        if (a.equals(b))
            System.out.println("a ("+a+") equals b ("+b+")");
        else
            System.out.println("a ("+a+") !equals b ("+b+")");

        if (c == a)
            System.out.println("c ("+c+") == a ("+a+")");
        else
            System.out.println("c ("+c+") != a ("+a+")");

    }
}
