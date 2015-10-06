package comp1110.lectures.C04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by comp1110 on 10/6/15.
 */
public class FilesInputStream {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {
            try {
                in = new FileInputStream("resources/words/hamlet.txt");

                for (int i = 0; i < 100; i++) {
                    byte b = (byte) in.read();   // ignore EOF here because we're bad
                    System.out.write(b);
                }
                System.out.flush();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
