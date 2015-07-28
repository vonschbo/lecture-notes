package comp1110.lectures.J06;

/**
 * Created by comp1110 on 7/28/15.
 */
public class ControlFlowWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("while i is: "+i);
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("stuff I really don't want to do when i == 2: ");

        }

  /*
        i = 0;
        do {
            System.out.println("do-while i is: "+i);
            i++;
        } while (i < 5); */
    }
}
