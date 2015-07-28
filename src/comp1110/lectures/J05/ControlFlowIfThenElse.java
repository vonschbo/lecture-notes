package comp1110.lectures.J05;

/**
 * Created by comp1110 on 7/28/15.
 */
public class ControlFlowIfThenElse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a && b) {
            System.out.println("Both a and b are true!");
        } else {
            System.out.println("At least one of a and b is false!");
        }

        if (a) {
            if (b) {
                System.out.println("Both a and b are true!");
            } else {
                System.out.println("a is true, b is false");
            }
        } else {
            if (b) {
                System.out.println("a is false and b is true");
            } else {
                System.out.println("Both a and b are false");
            }
        }
    }
}
