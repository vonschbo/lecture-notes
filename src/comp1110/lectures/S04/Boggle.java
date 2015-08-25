package comp1110.lectures.S04;


import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by comp1110 on 8/11/15.
 */
public class Boggle {
   static String[] dice = { "AJBBOO","AFFPSK","ANEAGE","APSHCO","QNUMHI","ZNHRLN","TDSTYI","TTWOOA","TLRYET","TUMIOC","EDVLRY","EDRLXI","EEGNHW","EIOTSS","ERHTWV","EENUSI"};
    static final int SIDE = (int) Math.sqrt(dice.length);
    static final List<HashSet<Integer>> neighbours = new ArrayList<HashSet<Integer>>(dice.length);
    static Set<String> boggleWords = new HashSet<String>();
    static Set<String> words = new HashSet<String>();
    static Set<String> prefixes = new HashSet<String>();

    static boolean[] used = new boolean[dice.length];

    static {
        for (int i = 0; i < dice.length; i++) {
            neighbours.add(i, new HashSet<Integer>());

            int [] distance = { -(SIDE +1), -SIDE, -(SIDE - 1),
                              -1,                1,
                                SIDE -1, SIDE, SIDE+1 };
            for (int d : distance) {
                int n = i + d;
                int ncol = n % SIDE;
                int icol = i % SIDE;
                if (n >= 0 && n < dice.length && Math.abs(ncol - icol) <= 1)
                    neighbours.get(i).add(n);
            }
        }
    }

    @Test
    public void testNeighbours() {
        assertFalse(neighbours.get(1).contains(3));
        assertFalse(neighbours.get(1).contains(-1));
        assertTrue(neighbours.get(1).contains(0));
        assertTrue(neighbours.get(1).contains(2));
        assertTrue(neighbours.get(1).contains(4));
        assertTrue(neighbours.get(1).contains(5));
        assertTrue(neighbours.get(1).contains(6));
    }


    @Test
    public void testBoggle() {
        char[] test = { 'R', 'H', 'R', 'E', 'Y', 'P', 'C', 'S', 'W', 'N', 'S', 'N', 'T', 'E', 'G', 'O'};
        boggle = test;
        processDictionary("resources/words/dictionary.txt", boggle);
        solveBoggle();
        assertTrue(boggleWords.contains("SPY"));
        assertTrue(boggleWords.contains("NET"));
        assertTrue(boggleWords.contains("SNOG"));
        assertTrue(boggleWords.contains("PRESS"));
        assertFalse(boggleWords.contains("NO"));
        assertFalse(boggleWords.contains("NOON"));
        assertFalse(boggleWords.contains("GOES"));
    }

    static boolean boggleble(String word, List<Character> usable) {
        if (word.length() < 3)
            return false;

        List<Character> letters = new ArrayList<Character>(usable);
        for (int i =0; i < word.length(); i++) {
            if (letters.contains(word.charAt(i))) {
                letters.remove(letters.indexOf(word.charAt(i)));
            } else {
                return false;
            }

        }
        return true;
    }

    static void processDictionary(String filename, char[] boggle) {
        List<Character> usable = new ArrayList<>();
        for (char c : boggle) {
            usable.add(c);
        }

        int allWords = 0;

        try {
            Scanner s = new Scanner(new File(filename));
            while (s.hasNext()) {
                allWords++;
                String word = s.next().toUpperCase();
                if (boggleble(word, usable)) {
                    words.add(word);
                    for (int ssl = 0; ssl < word.length(); ssl++) {
                        prefixes.add(word.substring(0, ssl));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Read in "+allWords+" words, "+words.size() + " of which were potential boggle words");
        System.out.println("and found "+prefixes.size()+" potential boggle prefixes");
    }

    static char[] shake() {
        char[] result = new char[dice.length];
        boolean[] used = new boolean[dice.length];

        Random r = new Random(412341);

        for (int i = 0; i < dice.length; i++) {
            int die = r.nextInt(dice.length);

            while (used[die]) {
                die = (die + 1) % dice.length;
            }
            used[die] = true;

            int face = r.nextInt(6);
            result[i] = dice[die].charAt(face);
        }
        return result;
    }

    static char[] boggle;

    static void printBoggle(char[] boggle) {
        for (int i = 0; i < dice.length; i++) {
            System.out.print(boggle[i]);
            if (i % 4 == 3) System.out.println();
        }
    }


    static void findwords(int start, String prefix) {
        used[start] = true;

        String candidate = prefix + boggle[start];
        if (words.contains(candidate)) {
            boggleWords.add(candidate);
        }
        if (prefixes.contains(candidate)) {
            for (int n : neighbours.get(start)) {
                if (!used[n]) {
                    findwords(n, candidate);
                }
            }
        }

        used[start] = false;
    }

    static void solveBoggle() {
        for (int i =  0; i < used.length; i++) {
            findwords(i, "");
        }

        System.out.println("Found "+boggleWords.size()+" words:");

        List<String> words = new ArrayList<>(boggleWords);

        Collections.sort(words, (String s1, String s2) -> {
            if (s1.length() == s2.length())
                return s1.compareTo(s2);
            else
                return s2.length() - s1.length();
        });

        for (String w : words) {
            System.out.println(w);
        }

    }

    public static void main(String[] args) {
        boggle = shake();
        printBoggle(boggle);
        processDictionary("resources/words/dictionary.txt", boggle);
        solveBoggle();
    }

}
