package comp1110.lectures.J03;

/**
 * Created by comp1110 on 7/24/15.
 */
public class Doubles {
    public static void main(String[] args) {
        double x = 3.1;
        System.out.println("x: "+x);
        double y = 1.2345e-6;
        System.out.println("y: "+y);
        String s = "3.32";
        double z = Double.parseDouble(s);
        System.out.println("z: "+z);
    }
}
