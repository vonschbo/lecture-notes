package comp1110.lectures.J11;

import java.util.Random;

/**
 * Created by comp1110 on 8/11/15.
 */
public class Boggle {
   static String[] dice = { "AJBBOO","AFFPSK","ANEAGE","APSHCO","QNUMHI","ZNHRLN","TDSTYI","TTWOOA","TLRYET","TUMIOC","EDVLRY","EDRLXI","EEGNHW","EIOTSS","ERHTWV","EENUSI"};

    public static void main(String[] args) {
        boolean[] used = new boolean[dice.length];

        Random r = new Random();

        for (int i = 0; i < dice.length; i++) {
            int die = r.nextInt(dice.length);

            while (used[die]) {
                die = (die + 1) % dice.length;
            }
            used[die] = true;

            int face = r.nextInt(6);
            char c = dice[die].charAt(face);
            System.out.print(c);
            if (i % 4 == 3) System.out.println();
        }

    }

}
