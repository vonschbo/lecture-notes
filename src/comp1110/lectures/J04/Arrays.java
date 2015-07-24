package comp1110.lectures.J04;

/**
 * Created by comp1110 on 7/24/15.
 */
public class Arrays {
    public static void main(String[] args) {
        double d[];
        d = new double[5];
        d[0] = 1.0;
        d[4] = 3.1;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(d[4]);
        d[4] = 3.2;
        System.out.println(d[4]);

        int x = 7;
        int[] i = { 2, x, 4, 5, 6, 9};
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        System.out.println(i[5]);
        x = 10;
        System.out.println(i[1]);

        double grid[][] = new double[2][];
        grid[0] = new double[2];
        grid[1] = new double[2];
        grid[0][0] = 1;
        grid[1][0] = 56;
        System.out.println(grid[0][0]);
        System.out.println(grid[1][0]);
    }
}
