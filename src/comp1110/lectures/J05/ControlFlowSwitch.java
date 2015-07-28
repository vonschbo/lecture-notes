package comp1110.lectures.J05;

/**
 * Created by comp1110 on 7/28/15.
 */
public class ControlFlowSwitch {
    public static void main(String[] args) {
        int c = 4;
        switch (c) {
            case 1:
                System.out.println("c == 1");
                break;
            case 7:
                System.out.println("c == 7");
                break;
            default:
                System.out.println("c is neither, it is "+c);
        }
    }
}
