package comp1110.lectures.O01;

/**
 * Created by comp1110 on 7/31/15.
 */
public class Objects {

    public static void main(String[] args) {
        Person fred = new Person("Fred", 21);
        Person mary = new Person("Mary", 20);
        System.out.println("I know about "+fred);
        System.out.println("I know about "+mary);
    }
}

