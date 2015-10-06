package comp1110.lectures.C04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by comp1110 on 10/6/15.
 */
public class FilesCopy {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            try {
                in = new FileInputStream("resources/words/hamlet.txt");
                out = new FileOutputStream("resources/words/output.txt");

                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                in.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

