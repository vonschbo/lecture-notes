package comp1110.lectures.C04;

import java.io.IOException;

/**
 * Created by comp1110 on 10/6/15.
 */
public class FilesStdio {
    public static void main(String[] args) {
        try {
            byte b = (byte) System.in.read();
            System.out.write(b);
            System.out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
