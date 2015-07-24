package comp1110.lectures.J04;

import java.util.Random;

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

        Random r = new Random();
        double w = r.nextDouble();
        System.out.println("random: "+w);

        System.out.println("not add, concatenation: "+ 3.0+5.1);
        System.out.println("add: "+ (3.0+5.1));
        System.out.println("sub: "+ (3.0-5.1));
        System.out.println("mul: "+ (3.0*5.1));
        System.out.println("div: "+ (3.0/5.1));
        System.out.println("conv to int (floor): "+ ((int) 3.7));
        System.out.println("conv to int (ceil): "+ (Math.round(3.7)));
        System.out.println("double (floor): "+ (Math.floor(3.7)));
        System.out.println("double (ceil): "+ (Math.ceil(3.7)));
        String q = String.format("%.5f", 3.124);
        System.out.println("format: "+q);
        System.out.println("max: "+Double.MAX_VALUE);
        System.out.println("min: "+Double.MIN_VALUE);
        System.out.println("size: "+Double.SIZE);
    }
}
