package comp1110.lectures.C04;

import java.io.*;

/**
 * Created by comp1110 on 10/6/15.
 */
public class FilesBuffering {
    public static void main(String[] args) {
        for (int j = 0 ; j < 20; j++) {
            InputStream in = null;
            OutputStream out = null;

            long start = 0;
            int count = 0;
            try {
                try {
                    if (false) {
                        in = new FileInputStream("resources/words/hamlet.txt");
                        out = new FileOutputStream("resources/words/output.txt");
                    } else {
                        in = new BufferedInputStream(new FileInputStream("resources/words/hamlet.txt"), 1<<j);
                        out = new BufferedOutputStream(new FileOutputStream("resources/words/output.txt"), 1<<j);
                    }


                    start = System.nanoTime();
                    int i;
                    while ((i = in.read()) != -1) {
                        out.write(i);
                        count++;
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    in.close();
                    out.close();
                    long stop = System.nanoTime();
                    System.out.println("That took " + (stop - start) / 1000000 + "msec to copy "+count+" bytes, with buffer size "+(1<<j));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

