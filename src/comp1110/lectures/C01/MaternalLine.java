package comp1110.lectures.C01;

import java.util.Scanner;

/**
 * Created by comp1110 on 8/25/15.
 */
public class MaternalLine {
    static String maternalAncestor(int n) {
        if (n == 1) {
            return "mother";
        } else {
            return "mother's "+maternalAncestor(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Type the depth of the maternal line you want: ");
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            System.out.println("Your order "+n+" maternal ancestor is your "+maternalAncestor(n));
            System.out.println("Type the depth of the maternal line you want: ");
        }
    }
}
