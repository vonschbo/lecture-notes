package comp1110.lectures.J06;

/**
 * Created by comp1110 on 7/28/15.
 */
public class ControlFlowFor {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if (i == 2) continue;
            System.out.println("i is: "+i);
        }
        int a[] = { 3, 6, 13, 2, 12};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] is "+a[i]);
        }

        for (int v : a) {
            System.out.println("next value is "+v);
        }
    }
}
