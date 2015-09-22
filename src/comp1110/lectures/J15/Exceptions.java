package comp1110.lectures.J15;

import java.util.Date;

/**
 * Created by comp1110 on 9/22/15.
 */
public class Exceptions {

    private static void exceptionalMethod() {
        System.out.println("Start of method");
        Date d = null; // new Date();
        try {
     //       d.toString();
            int i = 7 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Handling an arithmetic exception: " + ae);
   //         throw ae;
        } catch (Exception e) {
            System.out.println("Handling a general exception: " + e);
        } finally {
            System.out.println("In finally clause");
        }
        System.out.println("End of Method");
    }
    public static void main(String[] args) {
        try {
            exceptionalMethod();
        } catch (Exception e) {
            System.out.println("Caught it in main()!!");
        }
        System.out.println("End of program");
    }
}
