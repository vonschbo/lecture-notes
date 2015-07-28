package comp1110.lectures.J07;

/**
 * Created by comp1110 on 7/28/15.
 */
public class Methods {

    static void boo(int z) {
        System.out.println("Boo! "+z);
        z = 8;
        System.out.println("their z: " + z);
    }

    public static void main(String[] args) {
        int x = 3;
        boo(x);
        System.out.println("my x: " + x);
    }
}
