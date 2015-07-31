package comp1110.lectures.O02;

/**
 * Created by comp1110 on 7/31/15.
 */
public class Inheritence {

    public static void main(String[] args) {
        Person fred = new Person("Fred", 21, Sex.MALE);
        Person mary = new Student("Mary", 20, Sex.FEMALE, "u1234567");
        Person bob = new COMP1110Student("Bob", 22, Sex.MALE, "u2345678", 90, 8, 7, 4, 20);
        System.out.println("I know about "+fred);
        System.out.println("I know about "+mary);
        System.out.println("I know about "+bob);
    }
}

